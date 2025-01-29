package softuni.exam.service.impl;


import com.google.gson.Gson;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import softuni.exam.models.dto.CountryImportDto;
import softuni.exam.models.entity.Country;
import softuni.exam.repository.CompanyRepository;
import softuni.exam.repository.CountryRepository;
import softuni.exam.repository.PersonRepository;
import softuni.exam.service.CountryService;
import softuni.exam.util.ValidationUtilImpl;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

@Service
public class CountryServiceImpl implements CountryService {
    private static final String FILE_PATH = "src/main/resources/files/json/countries.json";
    Gson gson;
    ModelMapper modelMapper;
    ValidationUtilImpl validationUtil;
    CountryRepository countryRepository;
    CompanyRepository companyRepository;
    PersonRepository personRepository;

    public CountryServiceImpl(CountryRepository countryRepository,Gson gson,ModelMapper modelMapper,ValidationUtilImpl validationUtil, PersonRepository personRepository, CompanyRepository companyRepository) {
        this.countryRepository = countryRepository;
        this.gson = gson;
        this.modelMapper = modelMapper;
        this.validationUtil = validationUtil;
        this.personRepository = personRepository;
        this.companyRepository = companyRepository;
    }
    @Override
    public boolean areImported() {
        return countryRepository.count() > 0;
    }

    @Override
    public String readCountriesFileContent() throws IOException {
        return Files.readString(Path.of(FILE_PATH));
    }

    @Override
    public String importCountries() throws IOException {
        StringBuilder sb = new StringBuilder();
        CountryImportDto[] countryImportDtos = gson.fromJson(readCountriesFileContent(), CountryImportDto[].class);
        for (CountryImportDto countryImportDto : countryImportDtos) {
            if(!this.validationUtil.isValid(countryImportDto) ||
                this.countryRepository.findByName(countryImportDto.getName()).isPresent() ||
                 this.countryRepository.findByCode(countryImportDto.getCode()).isPresent()
                    || countryImportDto.getCode() == null){
                sb.append("Invalid country").append(System.lineSeparator());
                continue;

            }

            Country country = modelMapper.map(countryImportDto, Country.class);
            countryRepository.saveAndFlush(country);
            sb.append(String.format("Successfully imported country %s - %s",country.getName(),country.getCode())).append(System.lineSeparator());

        }


        return sb.toString();
    }
}
