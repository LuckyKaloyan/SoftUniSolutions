package softuni.exam.service.impl;

import com.google.gson.Gson;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import softuni.exam.models.dto.StarImportDto;
import softuni.exam.models.entity.Star;
import softuni.exam.models.enums.StarType;
import softuni.exam.repository.AstronomerRepository;
import softuni.exam.repository.ConstellationRepository;
import softuni.exam.repository.StarRepository;
import softuni.exam.service.StarService;
import softuni.exam.util.ValidationUtil;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

@Service
public class StarServiceImpl implements StarService {
    private final static String FILE_PATH = "src/main/resources/files/json/stars.json";
    Gson gson;
    ModelMapper modelMapper;
    ValidationUtil validationUtil;
    StarRepository starRepository;
    ConstellationRepository constellationRepository;
    AstronomerRepository astronomerRepository;

    public StarServiceImpl(Gson gson, ModelMapper modelMapper, AstronomerRepository astronomerRepository,ValidationUtil validationUtil, StarRepository starRepository,ConstellationRepository constellationRepository) {
        this.gson = gson;
        this.modelMapper = modelMapper;
        this.validationUtil = validationUtil;
        this.starRepository = starRepository;
        this.constellationRepository = constellationRepository;
        this.astronomerRepository = astronomerRepository;
    }


    @Override
    public boolean areImported() {
        return starRepository.count() > 0;
    }

    @Override
    public String readStarsFileContent() throws IOException {
        return Files.readString(Path.of(FILE_PATH));
    }

    @Override
    public String importStars() throws IOException {
        StringBuilder sb = new StringBuilder();
        StarImportDto[] starImportDtos = gson.fromJson(readStarsFileContent(), StarImportDto[].class);
        for (StarImportDto starImportDto : starImportDtos) {
            if(!validationUtil.isValid(starImportDto) || this.starRepository.findByName(starImportDto.getName()).isPresent()
            || starImportDto.getName()==null || starImportDto.getName().isEmpty() || starImportDto.getDescription()==null || starImportDto.getDescription().isEmpty()){
                sb.append("Invalid star").append(System.lineSeparator());
                continue;
            }

            Star star = this.modelMapper.map(starImportDto, Star.class);
            star.setConstellation(this.constellationRepository.findById(starImportDto.getConstellation()));
            this.starRepository.saveAndFlush(star);
            sb.append(String.format("Successfully imported star %s - %.2f light years",starImportDto.getName(),starImportDto.getLightYears())).append(System.lineSeparator());
        }

        return sb.toString();
    }

    @Override
    public String exportStars() {
     StringBuilder sb = new StringBuilder();
        List<Star> allStars = starRepository.findAllByAstronomersIsNullAndStarTypeOrderByLightYearsAsc(StarType.RED_GIANT);

        for(Star star : allStars){
                sb.append(String.format(
                        "Star: %s\n"
                                + "   *Distance: %.2f light years\n"
                                + "   **Description: %s\n"
                                + "   ***Constellation: %s", star.getName(), star.getLightYears(), star.getDescription(), star.getConstellation().getName())).append(System.lineSeparator());
        }
        return sb.toString();
    }
}
