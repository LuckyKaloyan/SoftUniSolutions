package softuni.exam.models.dto;

import com.google.gson.annotations.Expose;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Min;

public class CityImportDto {

    @Expose
    @Length(min = 2, max = 60)
    private String cityName;
    @Expose
    @Length(min = 2)
    private String description;
    @Expose
    @Min(500)
    private int population;
    @Expose
    private long country;

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setPopulation(int population) {
        this.population = population;
    }
    public void setCountry(long country) {
        this.country = country;
    }
    public String getCityName() {
        return this.cityName;
    }
    public String getDescription() {
        return this.description;
    }
    public int getPopulation() {
        return this.population;
    }
    public long getCountry() {
        return this.country;
    }
}
