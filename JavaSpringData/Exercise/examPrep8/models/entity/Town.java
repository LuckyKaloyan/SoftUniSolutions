package softuni.exam.models.entity;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "towns")
public class Town extends BaseEntity {

    @Column(name = "town_name", unique = true, nullable = false)
    private String townName;
    @Column(nullable = false)
    private int population;
    @OneToMany(mappedBy = "town",fetch = FetchType.LAZY)
    private List<Agent> agents;
    @OneToMany(mappedBy = "town", fetch=FetchType.LAZY)
    private List<Apartment> apartments;

    public String getTownName() {
        return townName;
    }

    public void setTownName(String townName) {
        this.townName = townName;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public List<Agent> getAgents() {
        return agents;
    }

    public void setAgents(List<Agent> agents) {
        this.agents = agents;
    }

    public List<Apartment> getApartments() {
        return apartments;
    }

    public void setApartments(List<Apartment> apartments) {
        this.apartments = apartments;
    }
}
