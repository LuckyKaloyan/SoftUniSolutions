package softuni.exam.service.impl;


import com.google.gson.Gson;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import softuni.exam.models.dto.PersonImportDto;
import softuni.exam.models.entity.Person;
import softuni.exam.repository.CountryRepository;
import softuni.exam.repository.PersonRepository;
import softuni.exam.service.PersonService;
import softuni.exam.util.ValidationUtilImpl;

import javax.xml.bind.JAXBException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

@Service
public class PersonServiceImpl implements PersonService {
    private static final String FILE_PATH = "src/main/resources/files/json/people.json";
    PersonRepository personRepository;
    Gson gson;
    ModelMapper modelMapper;
    ValidationUtilImpl validationUtil;
    CountryRepository countryRepository;

    public PersonServiceImpl(PersonRepository personRepository, Gson gson, ModelMapper modelMapper, ValidationUtilImpl validationUtil, CountryRepository countryRepository) {
        this.personRepository = personRepository;
        this.gson = gson;
        this.modelMapper = modelMapper;
        this.validationUtil = validationUtil;
        this.countryRepository = countryRepository;
    }


    @Override
    public boolean areImported() {
        return personRepository.count() > 0;
    }

    @Override
    public String readPeopleFromFile() throws IOException {
        return Files.readString(Path.of(FILE_PATH));
    }

    @Override
    public String importPeople() throws IOException {
        StringBuilder sb = new StringBuilder();
        PersonImportDto[] personImportDtos = gson.fromJson(readPeopleFromFile(), PersonImportDto[].class);
        for (PersonImportDto personImportDto : personImportDtos) {
            if(!validationUtil.isValid(personImportDto) || this.personRepository.findByFirstName((personImportDto.getFirstName())).isPresent()
             || this.personRepository.findByEmail(personImportDto.getEmail()).isPresent()
            || this.personRepository.findByPhone(personImportDto.getPhone()).isPresent()){
                sb.append("Invalid person").append(System.lineSeparator());
                continue;
            }


            Person person = modelMapper.map(personImportDto, Person.class);
            sb.append(String.format("Successfully imported person %s %s",personImportDto.getFirstName(), personImportDto.getLastName())).append(System.lineSeparator());
            person.setCountry(this.countryRepository.findById(Long.parseLong(personImportDto.getCountry())));

            this.personRepository.saveAndFlush(person);
        }


        return sb.toString();
    }
}
