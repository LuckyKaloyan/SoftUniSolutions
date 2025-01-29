package softuni.exam.models.entity;


import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "attractions")
public class Attraction extends BaseEntity {

    @Column(nullable = false)
    private String description;
    @Column(nullable = false)
    private int elevation;
    @Column(unique = true,nullable = false)
    private String name;
    @Column(nullable = false)
    private String type;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "country_id",referencedColumnName = "id", nullable = false)
    private Country country;
    @OneToMany(mappedBy = "attraction",fetch = FetchType.EAGER)
    private List<Visitor> visitors;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Visitor> getVisitors() {
        return visitors;
    }

    public void setVisitors(List<Visitor> visitors) {
        this.visitors = visitors;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getElevation() {
        return elevation;
    }

    public void setElevation(int elevation) {
        this.elevation = elevation;
    }
}
