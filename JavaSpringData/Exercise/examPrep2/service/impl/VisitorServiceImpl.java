package softuni.exam.service.impl;

import jakarta.xml.bind.JAXBException;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import softuni.exam.models.dto.VisitorImportDto;
import softuni.exam.models.dto.VisitorImportRootDto;
import softuni.exam.models.entity.Visitor;
import softuni.exam.repository.AttractionRepository;
import softuni.exam.repository.CountryRepository;
import softuni.exam.repository.PersonalDataRepository;
import softuni.exam.repository.VisitorRepository;
import softuni.exam.service.VisitorService;
import softuni.exam.util.ValidationUtilImpl;
import softuni.exam.util.XmlParserImpl;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

@Service
public class VisitorServiceImpl implements VisitorService {
    private static final String File_Path = "src/main/resources/files/xml/visitors.xml";

    PersonalDataRepository personalDataRepository;
    AttractionRepository attractionRepository;
    CountryRepository countryRepository;
    VisitorRepository visitorRepository;

    ModelMapper modelMapper;
    ValidationUtilImpl validationUtil;
    XmlParserImpl xmlParser;


    public VisitorServiceImpl(VisitorRepository visitorRepository, CountryRepository countryRepository,  AttractionRepository attractionRepository, PersonalDataRepository personalDataRepository) {
        this.visitorRepository = visitorRepository;
        this.xmlParser = new XmlParserImpl();
        this.validationUtil = new ValidationUtilImpl();
        this.modelMapper = new ModelMapper();
        this.attractionRepository = attractionRepository;
        this.personalDataRepository  = personalDataRepository;
        this.countryRepository = countryRepository;

    }
    @Override
    public boolean areImported() {
        return visitorRepository.count() != 0;

    }

    @Override
    public String readVisitorsFileContent() throws IOException {
        return Files.readString(Path.of(File_Path));
    }

    @Override
    public String importVisitors() throws JAXBException {
        StringBuilder sb = new StringBuilder();
        VisitorImportRootDto visitorImportRootDto = this.xmlParser.fromFile(File_Path, VisitorImportRootDto.class);

        for (VisitorImportDto visitorImportdto : visitorImportRootDto.getVisitorImportDtos()) {
            if (this.visitorRepository.findByFirstNameAndLastName(visitorImportdto.getFirstName(), visitorImportdto.getLastName()).isPresent() ||
                    !this.validationUtil.isValid(visitorImportdto) ||
                    this.visitorRepository.findByPersonalDataId(visitorImportdto.getPersonalData()).isPresent() ||
                    this.personalDataRepository.findById(visitorImportdto.getPersonalData()) == null) {
                sb.append("Invalid visitor").append(System.lineSeparator());
                continue;
            }

            // FROM THE DTO WE TAKE THE ID WE CALL THE METHOD FIND FROM THE REPO AND THROW IT TO THE OBJECT
            Visitor visitor = this.modelMapper.map(visitorImportdto, Visitor.class);
            visitor.setAttraction(this.attractionRepository.findById(visitorImportdto.getAttraction()));
            visitor.setPersonalData(this.personalDataRepository.findById(visitorImportdto.getPersonalData()));
            visitor.setCountry(this.countryRepository.findById(visitorImportdto.getCountry()));
            this.visitorRepository.saveAndFlush(visitor);
            sb.append(String.format("Successfully imported visitor %s %s", visitor.getFirstName(), visitor.getLastName()))
                    .append(System.lineSeparator());
        }

        return sb.toString();
    }



}
