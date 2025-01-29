package softuni.exam.models.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "countries")
public class Country extends BaseEntity {

    @Column(unique = true, nullable = false)
    private String name;
    @Column()
    private String capital;

    @OneToMany(mappedBy = "country", fetch = FetchType.EAGER)
    private List<Volcano> volcanoes;

    public Country() {}

    public List<Volcano> getVolcanoes() {
        return volcanoes;
    }

    public void setVolcanoes(List<Volcano> volcanoes) {
        this.volcanoes = volcanoes;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
