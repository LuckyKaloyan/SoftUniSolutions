package softuni.exam.models.dto;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "forecasts")
@XmlAccessorType(XmlAccessType.FIELD)
public class ForecastImportRootDto {

    @XmlElement(name = "forecast")
    private List<ForecastImportDto> forecastImportDtoList;

    public void setForecastImportDtoList(List<ForecastImportDto> forecastImportDtoList) {
        this.forecastImportDtoList = forecastImportDtoList;
    }
    public List<ForecastImportDto> getForecastImportDtoList() {
        return this.forecastImportDtoList;
    }

}
