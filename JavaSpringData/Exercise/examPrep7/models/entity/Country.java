package softuni.exam.models.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "countries")
public class Country extends BaseEntity {
    @Column(nullable = false, unique = true, name = "country_name")
    private String countryName;
    @Column(nullable = false)
    private String currency;
    @OneToMany(mappedBy = "country", fetch = FetchType.EAGER)
    private List<City> cities;

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public List<City> getCities() {
        return cities;
    }

    public void setCities(List<City> cities) {
        this.cities = cities;
    }
}
