package softuni.exam.models.entity;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "countries")
public class Country extends BaseEntity {

    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String code;
    @Column(nullable = false)
    private String currency;
    @OneToMany(mappedBy = "country", fetch = FetchType.LAZY)
    private List<Company> companies;
    @OneToMany(mappedBy = "country", fetch = FetchType.LAZY)
    private List<Person> people;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public List<Company> getCompanies() {
        return companies;
    }

    public void setCompanies(List<Company> companies) {
        this.companies = companies;
    }

    public List<Person> getPeople() {
        return people;
    }

    public void setPeople(List<Person> people) {
        this.people = people;
    }
}
