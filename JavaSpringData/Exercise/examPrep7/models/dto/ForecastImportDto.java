package softuni.exam.models.dto;


import org.springframework.lang.NonNull;
import softuni.exam.models.enums.DayOfWeek;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "forecast")
@XmlAccessorType(XmlAccessType.FIELD)
public class ForecastImportDto {

    @XmlElement
    private DayOfWeek day_of_week;
    @XmlElement
    @Min(-20)
    @Max(60)
    private double max_temperature;
    @XmlElement
    @Min(-50)
    @Max(40)
    private double min_temperature;
    @XmlElement
    private String sunrise;
    @XmlElement
    private String sunset;
    @XmlElement
    private long city;

    public DayOfWeek getDay_of_week() {
        return day_of_week;
    }

    public void setDay_of_week(DayOfWeek day_of_week) {
        this.day_of_week = day_of_week;
    }

    public long getCity() {
        return city;
    }

    public void setCity(long city) {
        this.city = city;
    }

    public String getSunset() {
        return sunset;
    }

    public void setSunset(String sunset) {
        this.sunset = sunset;
    }

    public String getSunrise() {
        return sunrise;
    }

    public void setSunrise(String sunrise) {
        this.sunrise = sunrise;
    }

    public double getMin_temperature() {
        return min_temperature;
    }

    public void setMin_temperature(double min_temperature) {
        this.min_temperature = min_temperature;
    }

    public double getMax_temperature() {
        return max_temperature;
    }

    public void setMax_temperature(double max_temperature) {
        this.max_temperature = max_temperature;
    }
}
