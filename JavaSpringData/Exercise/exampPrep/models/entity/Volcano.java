package softuni.exam.models.entity;

import softuni.exam.models.enums.VolcanoType;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "volcanoes")
public class Volcano extends BaseEntity {

    @Column(unique = true, nullable = false)
    private String name;
    @Column(nullable = false)
    private int elevation;
    @Enumerated(EnumType.STRING)
    @Column(name = "volcano_type")
    private VolcanoType volcanoType;
    @Column(name = "is_active", nullable = false)
    private boolean isActive;
    @Column(name = "last_eruption")
    private LocalDate lastEruption;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "country_id", referencedColumnName = "id")
    private Country country;
    @OneToMany(mappedBy = "exploringVolcano", fetch = FetchType.EAGER)
    private List<Volcanologist> volcanologists;

    public Volcano() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Volcanologist> getVolcanologists() {
        return volcanologists;
    }

    public void setVolcanologists(List<Volcanologist> volcanologists) {
        this.volcanologists = volcanologists;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public LocalDate getLastEruption() {
        return lastEruption;
    }

    public void setLastEruption(LocalDate lastEruption) {
        this.lastEruption = lastEruption;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public VolcanoType getVolcanoType() {
        return volcanoType;
    }

    public void setVolcanoType(VolcanoType volcanoType) {
        this.volcanoType = volcanoType;
    }

    public int getElevation() {
        return elevation;
    }

    public void setElevation(int elevation) {
        this.elevation = elevation;
    }

}