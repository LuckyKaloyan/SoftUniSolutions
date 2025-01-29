package softuni.exam.models.entity;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "cities")
public class City extends BaseEntity {

    @Column(name ="city_name", nullable = false)
    private String cityName;
    @Column
    @Lob
    private String description;
    @Column(nullable = false)
    private int population;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "country_id", referencedColumnName = "id")
    private Country country;
    @OneToMany(mappedBy = "city", fetch = FetchType.EAGER)
    private List<Forecast> forecasts;

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public List<Forecast> getForecasts() {
        return forecasts;
    }

    public void setForecasts(List<Forecast> forecasts) {
        this.forecasts = forecasts;
    }
}
