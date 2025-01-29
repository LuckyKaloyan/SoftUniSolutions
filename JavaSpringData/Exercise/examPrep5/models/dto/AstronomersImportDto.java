package softuni.exam.models.dto;


import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Min;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "astronomer")
@XmlAccessorType(XmlAccessType.FIELD)
public class AstronomersImportDto {

    @XmlElement(name = "average_observation_hours")
    @Min(500)
    private double averageObservationHours;
    @XmlElement(name= "birthday")
    private String birthDay;
    @XmlElement(name = "first_name")
    @Length(min = 2, max = 30)
    private String firstName;
    @XmlElement(name = "last_name")
    @Length(min = 2, max = 30)
    private String lastName;
    @XmlElement(name = "salary")
    @Min(15000)
    private double salary;
    @XmlElement(name = "observing_star_id")
    private long observingStarId;

    public double getAverageObservationHours() {
        return averageObservationHours;
    }

    public void setAverageObservationHours(double averageObservationHours) {
        this.averageObservationHours = averageObservationHours;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public long getObservingStarId() {
        return observingStarId;
    }

    public void setObservingStarId(long observingStarId) {
        this.observingStarId = observingStarId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
