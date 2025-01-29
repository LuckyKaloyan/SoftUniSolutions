package softuni.exam.service.impl;

import com.google.gson.Gson;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import softuni.exam.models.dto.AstronomersImportDto;
import softuni.exam.models.dto.AstronomersImportRootDto;
import softuni.exam.models.entity.Astronomer;
import softuni.exam.repository.AstronomerRepository;
import softuni.exam.repository.StarRepository;
import softuni.exam.service.AstronomerService;
import softuni.exam.util.ValidationUtil;
import softuni.exam.util.XmlParserImpl;

import javax.xml.bind.JAXBException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;

@Service
public class AstronomerServiceImpl implements AstronomerService {
    private final static String FILE_PATH = "src/main/resources/files/xml/astronomers.xml";

    AstronomerRepository astronomerRepository;
    XmlParserImpl xmlParser;
    ModelMapper modelMapper;
    ValidationUtil validationUtil;
    StarRepository starRepository;

    public AstronomerServiceImpl(AstronomerRepository astronomerRepository,StarRepository starRepository, ModelMapper modelMapper,ValidationUtil validationUtil,XmlParserImpl xmlParser) {
        this.astronomerRepository = astronomerRepository;
        this.modelMapper = modelMapper;
        this.validationUtil = validationUtil;
        this.xmlParser = xmlParser;
        this.starRepository = starRepository;
    }


    @Override
    public boolean areImported() {
        return astronomerRepository.count() > 0;
    }

    @Override
    public String readAstronomersFromFile() throws IOException {
        return Files.readString(Path.of(FILE_PATH));
    }

    @Override
    public String importAstronomers() throws IOException, JAXBException {
        StringBuilder sb = new StringBuilder();
        AstronomersImportRootDto astronomersImportRootDto = this.xmlParser.fromFile(FILE_PATH, AstronomersImportRootDto.class);

        for(AstronomersImportDto astronomersImportDto: astronomersImportRootDto.getAstronomersImportDtoList()){
            if(!this.validationUtil.isValid(astronomersImportDto) || !this.starRepository.findById(astronomersImportDto.getObservingStarId()).isPresent()
                    || this.astronomerRepository.findByFirstNameAndLastName(astronomersImportDto.getFirstName(), astronomersImportDto.getLastName()).isPresent()
            ){
                 sb.append("Invalid astronomer").append(System.lineSeparator());
                 continue;
            }
            Astronomer astronomer = this.modelMapper.map(astronomersImportDto, Astronomer.class);
            astronomer.setBirthDay(LocalDate.parse(astronomersImportDto.getBirthDay()));
            astronomer.setStar(this.starRepository.findStarById(astronomersImportDto.getObservingStarId()));
            this.astronomerRepository.saveAndFlush(astronomer);

            sb.append(String.format("Successfully imported astronomer %s %s - %.2f",astronomersImportDto.getFirstName(),astronomersImportDto.getLastName(),astronomersImportDto.getAverageObservationHours())).append(System.lineSeparator());




        }


        return sb.toString();
    }
}
