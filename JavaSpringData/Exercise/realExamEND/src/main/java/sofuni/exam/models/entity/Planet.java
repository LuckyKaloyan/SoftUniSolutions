package sofuni.exam.models.entity;

import jakarta.persistence.*;
import sofuni.exam.models.enums.Type;

import java.util.List;

@Entity
@Table(name = "planets")
public class Planet extends BaseEntity {

    @Column(nullable = false)
    private int diameter;
    @Column(nullable = false, name = "distance_from_sun")
    private long distanceFromSun;
    @Column(nullable = false, unique = true)
    private String name;
    @Column(name = "orbital_period", nullable = false)
    private double orbitalPeriod;
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Type type;

    @OneToMany(mappedBy = "planet", fetch = FetchType.EAGER)
    private List<Moon> moons;

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public List<Moon> getMoons() {
        return moons;
    }

    public void setMoons(List<Moon> moons) {
        this.moons = moons;
    }
}
