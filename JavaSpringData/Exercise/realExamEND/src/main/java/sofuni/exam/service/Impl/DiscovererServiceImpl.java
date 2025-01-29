package sofuni.exam.service.Impl;

import com.google.gson.Gson;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import sofuni.exam.models.dto.DiscovererImportDto;
import sofuni.exam.models.entity.Discoverer;
import sofuni.exam.repository.DiscovererRepository;
import sofuni.exam.service.DiscovererService;
import sofuni.exam.util.ValidationUtil;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

@Service
public class DiscovererServiceImpl implements DiscovererService {

    private static final String File_Path = "src/main/resources/files/json/discoverers.json";
    DiscovererRepository discovererRepository;
    Gson gson;
    ModelMapper modelMapper;
    ValidationUtil validationUtil;

    public DiscovererServiceImpl(ModelMapper modelMapper, ValidationUtil validationUtil, DiscovererRepository discovererRepository, Gson gson) {
        this.modelMapper = modelMapper;
        this.validationUtil = validationUtil;
        this.discovererRepository = discovererRepository;
        this.gson = gson;

    }


    @Override
    public boolean areImported() {
        return discovererRepository.count() > 0;
    }

    @Override
    public String readDiscovererFileContent() throws IOException {
        return Files.readString(Path.of(File_Path));
    }

    @Override
    public String importDiscoverers() throws IOException {
        StringBuilder sb = new StringBuilder();
        DiscovererImportDto[] discovererImportDtos = gson.fromJson(readDiscovererFileContent(), DiscovererImportDto[].class);
        for (DiscovererImportDto discovererImportDto : discovererImportDtos) {
            if(!validationUtil.isValid(discovererImportDto)
                    || discovererRepository.findByFirstNameAndLastName(discovererImportDto.getFirstName(), discovererImportDto.getLastName()).isPresent()
                   || discovererImportDto.getFirstName() == null || discovererImportDto.getLastName() == null || discovererImportDto.getNationality()==null){
                sb.append("Invalid discoverer").append(System.lineSeparator());
                continue;
            }
            Discoverer discoverer = modelMapper.map(discovererImportDto, Discoverer.class);
            sb.append(String.format("Successfully imported discoverer %s %s", discoverer.getFirstName(), discoverer.getLastName())).append(System.lineSeparator());
            discovererRepository.saveAndFlush(discoverer);
        }

        return sb.toString();
    }
}
