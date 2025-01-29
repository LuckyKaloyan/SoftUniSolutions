package sofuni.exam.models.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "moons")
public class Moon extends BaseEntity {

    @Column(nullable = false)
    private LocalDate discovered;
    @Column(name = "distance_from_planet")
    private int distanceFromPlanet;
    @Column(nullable = false, unique = true)
    private String name;
    @Column(nullable = false)
    private double radius;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(referencedColumnName = "id", name = "planet_id", nullable = false)
    private Planet planet;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(referencedColumnName = "id", name = "discoverer_id", nullable = false)
    private Discoverer discoverer;

    public LocalDate getDiscovered() {
        return discovered;
    }

    public void setDiscovered(LocalDate discovered) {
        this.discovered = discovered;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Planet getPlanet() {
        return planet;
    }

    public void setPlanet(Planet planet) {
        this.planet = planet;
    }

    public Discoverer getDiscoverer() {
        return discoverer;
    }

    public void setDiscoverer(Discoverer discoverer) {
        this.discoverer = discoverer;
    }
}
