package softuni.exam.service.impl;

import com.google.gson.Gson;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import softuni.exam.models.dto.CountryImportDto;
import softuni.exam.models.entity.Country;
import softuni.exam.repository.CountryRepository;
import softuni.exam.service.CountryService;
import softuni.exam.util.ValidationUtil;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

@Service
public class CountryServiceImpl implements CountryService {

    private final static String FILE_PATH = "src/main/resources/files/json/countries.json";

    CountryRepository countryRepository;
    Gson gson;
    ValidationUtil validationUtil;
    ModelMapper modelMapper;

    public CountryServiceImpl(CountryRepository countryRepository, Gson gson, ValidationUtil validationUtil, ModelMapper modelMapper) {
        this.countryRepository = countryRepository;
        this.gson = gson;
        this.validationUtil = validationUtil;
        this.modelMapper = modelMapper;
    }


    @Override
    public boolean areImported() {
        return countryRepository != null;
    }

    @Override
    public String readCountriesFromFile() throws IOException {
        return Files.readString(Path.of(FILE_PATH));
    }

    @Override
    public String importCountries() throws IOException {
     StringBuilder sb = new StringBuilder();

        CountryImportDto[] countryImportDtos = gson.fromJson(readCountriesFromFile(), CountryImportDto[].class);
        for (CountryImportDto countryImportDto : countryImportDtos) {
            if(!validationUtil.isValid(countryImportDto) || this.countryRepository.findByCountryName(countryImportDto.getCountryName()).isPresent() ||
             countryImportDto.getCountryName()==null || countryImportDto.getCurrency()==null){
                sb.append("Invalid country").append(System.lineSeparator());
                 continue;
            }

            Country country = modelMapper.map(countryImportDto, Country.class);
            sb.append(String.format("Successfully imported country %s - %s", countryImportDto.getCountryName(),countryImportDto.getCurrency())).append(System.lineSeparator());
            this.countryRepository.saveAndFlush(country);
        }


     return sb.toString();

    }
}
