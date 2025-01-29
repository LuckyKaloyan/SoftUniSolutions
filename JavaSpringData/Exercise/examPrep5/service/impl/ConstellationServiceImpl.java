package softuni.exam.service.impl;

import com.google.gson.Gson;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import softuni.exam.models.dto.ConstellationImportDto;
import softuni.exam.models.entity.Constellation;
import softuni.exam.repository.ConstellationRepository;
import softuni.exam.service.ConstellationService;
import softuni.exam.util.ValidationUtil;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

@Service
public class ConstellationServiceImpl implements ConstellationService {

    private final static String FILE_PATH = "src/main/resources/files/json/constellations.json";
    ConstellationRepository constellationRepository;
    Gson gson;
    ModelMapper modelMapper;
    ValidationUtil validationUtil;

    public ConstellationServiceImpl(ConstellationRepository constellationRepository,Gson gson,ModelMapper modelMapper,ValidationUtil validationUtil) {
        this.constellationRepository = constellationRepository;
        this.gson = gson;
        this.modelMapper = modelMapper;
        this.validationUtil = validationUtil;
    }

    @Override
    public boolean areImported() {
        return constellationRepository.count() > 0;
    }

    @Override
    public String readConstellationsFromFile() throws IOException {
        return Files.readString(Path.of(FILE_PATH));
    }

    @Override
    public String importConstellations() throws IOException {
        StringBuilder sb = new StringBuilder();
        ConstellationImportDto[] constellationImportDtos = gson.fromJson(readConstellationsFromFile(), ConstellationImportDto[].class);
        for (ConstellationImportDto constellationImportDto : constellationImportDtos) {
            if(!this.validationUtil.isValid(constellationImportDto) || constellationRepository.findByName(constellationImportDto.getName()).isPresent()
            || constellationImportDto.getName()==null || constellationImportDto.getName().isEmpty()){
                sb.append("Invalid constellation").append(System.lineSeparator());
                continue;
            }
            Constellation constellation = modelMapper.map(constellationImportDto, Constellation.class);
            constellationRepository.save(constellation);
            constellationRepository.flush();
            sb.append(String.format("Successfully imported constellation %s - %s",constellation.getName(),constellation.getDescription())).append(System.lineSeparator());
        }
        return sb.toString();
    }
}
