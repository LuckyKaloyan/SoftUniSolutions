package softuni.exam.models.dto;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "astronomers")
@XmlAccessorType(XmlAccessType.FIELD)
public class AstronomersImportRootDto {

    @XmlElement(name = "astronomer")
    private List<AstronomersImportDto> astronomersImportDtoList;

    public void setAstronomersImportDtoList(List<AstronomersImportDto> list) {
        this.astronomersImportDtoList = list;
    }
    public List<AstronomersImportDto> getAstronomersImportDtoList() {
        return this.astronomersImportDtoList;
    }
}
