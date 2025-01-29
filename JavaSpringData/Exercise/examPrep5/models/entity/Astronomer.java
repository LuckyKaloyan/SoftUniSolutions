package softuni.exam.models.entity;


import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "astronomers")
public class Astronomer extends BaseEntity {
    @Column(name = "first_name", nullable = false)
    private String firstName;
    @Column(name = "last_name", nullable = false)
    private String lastName;
    @Column(nullable = false)
    private double salary;
    @Column(nullable = false)
    private double averageObservationHours;
    @Column(name = "birthday")
    private LocalDate birthDay;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "observing_star_id", referencedColumnName = "id")
    private Star star;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Star getStar() {
        return star;
    }

    public void setStar(Star star) {
        this.star = star;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    public double getAverageObservationHours() {
        return averageObservationHours;
    }

    public void setAverageObservationHours(double averageObservationHours) {
        this.averageObservationHours = averageObservationHours;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
