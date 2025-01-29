package softuni.exam.models.entity;

import softuni.exam.models.enums.StarType;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "stars")
public class Star extends BaseEntity {
    @Column(nullable = false, unique = true)
    private String name;
    @Column(nullable = false)
    private double lightYears;
    @Lob
    @Column(nullable = false)
    private String description;
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private StarType starType;
    @OneToMany(mappedBy = "star",fetch = FetchType.EAGER)
    private List<Astronomer> astronomers;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "constellation_id", referencedColumnName = "id")
    private Constellation constellation;

    public String getName() {
        return name;
    }

    public Constellation getConstellation() {
        return constellation;
    }

    public void setConstellation(Constellation constellation) {
        this.constellation = constellation;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLightYears() {
        return lightYears;
    }

    public void setLightYears(double lightYears) {
        this.lightYears = lightYears;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public StarType getStarType() {
        return starType;
    }

    public void setStarType(StarType starType) {
        this.starType = starType;
    }

    public List<Astronomer> getAstronomers() {
        return astronomers;
    }

    public void setAstronomers(List<Astronomer> astronomers) {
        this.astronomers = astronomers;
    }
}
