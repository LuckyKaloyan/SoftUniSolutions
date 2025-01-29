package softuni.exam.models.entity;


import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "countries")
public class Country extends BaseEntity {
    @Column
    private double area;
    @Column(unique = true,nullable = false)
    private String name;
    @OneToMany(mappedBy = "country",fetch = FetchType.EAGER)
    private List<Attraction> attractions;



    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Attraction> getAttractions() {
        return attractions;
    }

    public void setAttractions(List<Attraction> attractions) {
        this.attractions = attractions;
    }
}
