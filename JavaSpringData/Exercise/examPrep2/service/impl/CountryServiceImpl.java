package softuni.exam.service.impl;
import com.google.gson.Gson;
import org.modelmapper.ModelMapper;
import softuni.exam.models.dto.CountryImportDto;

import org.springframework.stereotype.Service;
import softuni.exam.models.entity.Country;
import softuni.exam.repository.CountryRepository;
import softuni.exam.service.CountryService;
import softuni.exam.util.ValidationUtil;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


@Service
public class CountryServiceImpl implements CountryService {

    private static final String File_Path = "src/main/resources/files/json/countries.json";
    CountryRepository countryRepository;
    private final Gson gson;
    private final ValidationUtil validationUtil;
    private final ModelMapper modelMapper;

    public CountryServiceImpl(CountryRepository countryRepository, Gson gson, ValidationUtil validationUtil, ModelMapper modelMapper) {
        this.countryRepository = countryRepository;
        this.gson = gson;
        this.validationUtil = validationUtil;
        this.modelMapper = modelMapper;
    }



    @Override
    public boolean areImported() {

        return countryRepository.count() != 0;
    }

    @Override
    public String readCountryFileContent() throws IOException {
        return Files.readString(Path.of(File_Path));
    }

    @Override
    public String importCountries() throws IOException {
        StringBuilder sb = new StringBuilder();
        String fileContent = new String(Files.readAllBytes(Paths.get(File_Path)));
        CountryImportDto[] countryImportDtos = gson.fromJson(fileContent, CountryImportDto[].class);
        for (CountryImportDto countryImportDto : countryImportDtos) {
            if (countryImportDto.getName() == null ||
                    this.countryRepository.findByName(countryImportDto.getName()).isPresent() ||
                    !this.validationUtil.isValid(countryImportDto)) {
                sb.append("Invalid country").append(System.lineSeparator());
                continue;
            }

            Country country = new Country();
            country.setName(countryImportDto.getName());
            country.setArea(countryImportDto.getArea());

            this.countryRepository.save(country);
            sb.append(String.format("Successfully imported country %s", country.getName()))
                    .append(System.lineSeparator());
        }

        return sb.toString();
    }
}
