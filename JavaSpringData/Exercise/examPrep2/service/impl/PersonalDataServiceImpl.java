package softuni.exam.service.impl;

import jakarta.xml.bind.JAXBException;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import softuni.exam.models.Gender;
import softuni.exam.models.dto.PersonalDataImportDto;
import softuni.exam.models.dto.PersonalDataImportRootDto;
import softuni.exam.models.entity.PersonalData;
import softuni.exam.repository.PersonalDataRepository;
import softuni.exam.service.PersonalDataService;
import softuni.exam.util.ValidationUtil;
import softuni.exam.util.XmlParserImpl;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;


@Service
public class PersonalDataServiceImpl implements PersonalDataService {

    private final static String File_Path = "src/main/resources/files/xml/personal_data.xml";


    XmlParserImpl xmlParser = new XmlParserImpl();
    private final ValidationUtil validationUtil;
    private final ModelMapper modelMapper;
    PersonalDataRepository personalDataRepository;

    public PersonalDataServiceImpl(ValidationUtil validationUtil, ModelMapper modelMapper, PersonalDataRepository personalDataRepository) {
        this.validationUtil = validationUtil;
        this.modelMapper = modelMapper;
        this.personalDataRepository = personalDataRepository;
    }

    @Override
    public boolean areImported() {
        return personalDataRepository.count() != 0;

    }

    @Override
    public String readPersonalDataFileContent() throws IOException {
       return Files.readString(Paths.get(File_Path));
    }

    @Override
    public String importPersonalData() throws  JAXBException {
        StringBuilder sb = new StringBuilder();

        PersonalDataImportRootDto personalDataImportRootDto = this.xmlParser.fromFile(File_Path, PersonalDataImportRootDto.class);
        for(PersonalDataImportDto personalDataImportDto : personalDataImportRootDto.getPersonalDataImportDtos()) {
            if(personalDataRepository.findByCardNumber(personalDataImportDto.getCardNumber()).isPresent() ||
            !this.validationUtil.isValid(personalDataImportDto)) {
                sb.append("Invalid personal data").append(System.lineSeparator());
                continue;
            }

            PersonalData personalData = modelMapper.map(personalDataImportDto, PersonalData.class);
            personalData.setCardNumber(personalDataImportDto.getCardNumber());
            personalData.setAge(personalDataImportDto.getAge());
            personalData.setGender(Gender.valueOf(personalDataImportDto.getGender()));
            personalData.setBirthDate(LocalDate.parse(personalDataImportDto.getBirthDate()));

            this.personalDataRepository.saveAndFlush(personalData);

            sb.append(String.format(
                    "Successfully imported personal data for visitor with card number %s", personalDataImportDto.getCardNumber()
            )).append(System.lineSeparator());
        }

        return sb.toString();
    }
}
