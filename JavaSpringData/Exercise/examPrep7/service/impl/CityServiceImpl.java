package softuni.exam.service.impl;


import com.google.gson.Gson;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import softuni.exam.models.dto.CityImportDto;
import softuni.exam.models.entity.City;
import softuni.exam.repository.CityRepository;
import softuni.exam.repository.CountryRepository;
import softuni.exam.service.CityService;
import softuni.exam.util.ValidationUtil;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

@Service
public class CityServiceImpl implements CityService {
    private final static String FILE_PATH = "src/main/resources/files/json/cities.json";
    CityRepository cityRepository;
    CountryRepository countryRepository;
    Gson gson;
    ValidationUtil validationUtil;
    ModelMapper modelMapper;

    public CityServiceImpl(CityRepository cityRepository, CountryRepository countryRepository, Gson gson, ValidationUtil validationUtil, ModelMapper modelMapper) {
        this.cityRepository = cityRepository;
        this.countryRepository = countryRepository;
        this.gson = gson;
        this.validationUtil = validationUtil;
        this.modelMapper = modelMapper;

    }

    @Override
    public boolean areImported() {
        return cityRepository != null;
    }

    @Override
    public String readCitiesFileContent() throws IOException {
        return Files.readString(Path.of(FILE_PATH));
    }

    @Override
    public String importCities() throws IOException {
        StringBuilder sb = new StringBuilder();
        CityImportDto[] cityImportDtos = gson.fromJson(readCitiesFileContent(), CityImportDto[].class);
        for (CityImportDto cityImportDto : cityImportDtos) {
            if(!this.validationUtil.isValid(cityImportDto) || this.cityRepository.findByCityName(cityImportDto.getCityName()).isPresent()
            || cityImportDto.getCityName() == null || cityImportDto.getPopulation() < 500) {
                sb.append("Invalid city").append(System.lineSeparator());
                continue;
            }

            City city = this.modelMapper.map(cityImportDto, City.class);
            city.setCountry(this.countryRepository.findById(cityImportDto.getCountry()));
            sb.append(String.format("Successfully imported city %s - %d",cityImportDto.getCityName(),cityImportDto.getPopulation())).append(System.lineSeparator());
            this.cityRepository.saveAndFlush(city);
        }

        return sb.toString();
    }
}
