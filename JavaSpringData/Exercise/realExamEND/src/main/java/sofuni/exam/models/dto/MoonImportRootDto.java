package sofuni.exam.models.dto;


import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.List;


@XmlRootElement(name = "moons")
@XmlAccessorType(XmlAccessType.FIELD)
public class MoonImportRootDto {

    @XmlElement(name = "moon")
    private List<MoonImportDto> moonImportDtos;

    public List<MoonImportDto> getMoonImportDtos() {
        return moonImportDtos;
    }
}
