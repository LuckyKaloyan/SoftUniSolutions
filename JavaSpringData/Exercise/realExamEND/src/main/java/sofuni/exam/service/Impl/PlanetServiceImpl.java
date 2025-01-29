package sofuni.exam.service.Impl;

import com.google.gson.Gson;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import sofuni.exam.models.dto.PlanetImportDto;
import sofuni.exam.models.entity.Planet;
import sofuni.exam.repository.PlanetRepository;
import sofuni.exam.service.PlanetService;
import sofuni.exam.util.ValidationUtil;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

@Service
public class PlanetServiceImpl implements PlanetService {
    private static final String File_Path = "src/main/resources/files/json/planets.json";
    Gson gson;
    ModelMapper modelMapper;
    ValidationUtil validationUtil;
    PlanetRepository planetRepository;

    public PlanetServiceImpl(ModelMapper modelMapper, ValidationUtil validationUtil, PlanetRepository planetRepository, Gson gson) {
        this.gson = gson;
        this.modelMapper = modelMapper;
        this.validationUtil = validationUtil;
        this.planetRepository = planetRepository;
    }

    @Override
    public boolean areImported() {

        return planetRepository.count() > 0;
    }

    @Override
    public String readPlanetsFileContent() throws IOException {
        return Files.readString(Path.of(File_Path));
    }

    @Override
    public String importPlanets() throws IOException {
        StringBuilder sb = new StringBuilder();
        PlanetImportDto[] planetImportDtos = gson.fromJson(readPlanetsFileContent(), PlanetImportDto[].class);
        for (PlanetImportDto planetImportDto : planetImportDtos) {
            if(!validationUtil.isValid(planetImportDto) || this.planetRepository.findByName(planetImportDto.getName()).isPresent() ||
             planetImportDto.getDiameter() == 0 || planetImportDto.getDistanceFromSun() == 0 || planetImportDto.getName() == null ||
            planetImportDto.getOrbitalPeriod() == 0){
                sb.append("Invalid planet").append(System.lineSeparator());
                continue;
            }

            Planet planet = modelMapper.map(planetImportDto, Planet.class);
            sb.append(String.format("Successfully imported planet %s",planetImportDto.getName())).append(System.lineSeparator());
            planetRepository.saveAndFlush(planet);

        }


        return sb.toString();
    }
}
