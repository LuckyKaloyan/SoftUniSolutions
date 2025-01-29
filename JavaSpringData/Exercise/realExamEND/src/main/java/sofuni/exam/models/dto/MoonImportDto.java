package sofuni.exam.models.dto;


import jakarta.validation.constraints.Positive;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.UniqueElements;

@XmlRootElement(name = "moon")
@XmlAccessorType(XmlAccessType.FIELD)
public class MoonImportDto {


    @XmlElement
    @Length(min = 2, max = 10)
    private String name;
    @XmlElement
    private String discovered;
    @XmlElement
    @Positive
    private int distance_from_planet;
    @XmlElement
    @Positive
    private double radius;
    @XmlElement
    private long discoverer_id;
    @XmlElement
    private long planet_id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDiscovered() {
        return discovered;
    }

    public void setDiscovered(String discovered) {
        this.discovered = discovered;
    }

    public int getDistance_from_planet() {
        return distance_from_planet;
    }

    public void setDistance_from_planet(int distance_from_planet) {
        this.distance_from_planet = distance_from_planet;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public long getDiscoverer_id() {
        return discoverer_id;
    }

    public void setDiscoverer_id(long discoverer_id) {
        this.discoverer_id = discoverer_id;
    }

    public long getPlanet_id() {
        return planet_id;
    }

    public void setPlanet_id(long planet_id) {
        this.planet_id = planet_id;
    }
}
