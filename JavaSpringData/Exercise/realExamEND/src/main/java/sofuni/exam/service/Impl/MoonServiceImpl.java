package sofuni.exam.service.Impl;

import jakarta.xml.bind.JAXBException;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import sofuni.exam.models.dto.MoonImportDto;
import sofuni.exam.models.dto.MoonImportRootDto;
import sofuni.exam.models.entity.Moon;
import sofuni.exam.models.enums.Type;
import sofuni.exam.repository.DiscovererRepository;
import sofuni.exam.repository.MoonRepository;
import sofuni.exam.repository.PlanetRepository;
import sofuni.exam.service.MoonService;
import sofuni.exam.util.ValidationUtil;
import sofuni.exam.util.ValidationUtilImpl;
import sofuni.exam.util.XmlParserImpl;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.List;


@Service
public class MoonServiceImpl implements MoonService {
    private static final String File_Path = "src/main/resources/files/xml/moons.xml";
    MoonRepository moonRepository;
    PlanetRepository planetRepository;
    DiscovererRepository discovererRepository;
    ModelMapper modelMapper;
    ValidationUtil validationUtil;
    XmlParserImpl xmlParser;

    public MoonServiceImpl(XmlParserImpl xmlParser, ValidationUtilImpl validationUtil, ModelMapper modelMapper, MoonRepository moonRepository, PlanetRepository planetRepository, DiscovererRepository discovererRepository) {
        this.xmlParser = xmlParser;
        this.validationUtil = validationUtil;
        this.modelMapper = modelMapper;
        this.moonRepository = moonRepository;
        this.planetRepository = planetRepository;
        this.discovererRepository = discovererRepository;
    }

    @Override
    public boolean areImported() {
        return moonRepository.count() > 0;
    }

    @Override
    public String readMoonsFileContent() throws IOException {
        return Files.readString(Path.of(File_Path));
    }

    @Override
    public String importMoons() throws JAXBException {
        StringBuilder sb = new StringBuilder();
        MoonImportRootDto moonImportRootDto = xmlParser.fromFile(File_Path, MoonImportRootDto.class);
        List<MoonImportDto> moonImportDtos = moonImportRootDto.getMoonImportDtos();
        for (MoonImportDto moonImportDto : moonImportDtos) {
            if(moonRepository.findByName(moonImportDto.getName()).isPresent() || !validationUtil.isValid(moonImportDto) ||
                  moonImportDto.getDiscovered() == null || moonImportDto.getDiscoverer_id() == 0
             || moonImportDto.getRadius() == 0 || moonImportDto.getName() == null || moonImportDto.getPlanet_id() == 0) {
                sb.append("Invalid moon").append(System.lineSeparator());
                continue;
            }
            Moon moon = modelMapper.map(moonImportDto, Moon.class);
            moon.setDiscovered(LocalDate.parse(moonImportDto.getDiscovered()));
            moon.setPlanet(planetRepository.findById(moonImportDto.getPlanet_id()));
            moon.setDiscoverer(discovererRepository.findById(moonImportDto.getDiscoverer_id()));
            moonRepository.saveAndFlush(moon);
            sb.append(String.format("Successfully imported moon %s",moonImportDto.getName())).append(System.lineSeparator());
        }
        return sb.toString();
    }

    @Override
    public String exportMoons() {
        StringBuilder sb = new StringBuilder();
        List<Moon> moons = moonRepository.findByRadiusBetweenOrderByNameAsc(700,2000);
        for (Moon moon : moons) {
            if(moon.getPlanet().getType()== Type.GAS_GIANT){
                sb.append(String.format(
                        "***Moon %s is a natural satellite of %s and has a radius of %.2f km.\n" +
                        "****Discovered by %s %s\n",
                        moon.getName(),moon.getPlanet().getName(),moon.getRadius(),moon.getDiscoverer().getFirstName(),moon.getDiscoverer().getLastName())).append(System.lineSeparator());
            }
           }
        return sb.toString();
    }
}
