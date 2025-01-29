package sofuni.exam.models.entity;


import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "discoverers")
public class Discoverer extends BaseEntity {

    @Column(nullable = false, name = "first_name")
    private String firstName;
    @Column(nullable = false, name = "last_name")
    private String lastName;
    @Column(nullable = false)
    private String nationality;
    @Column
    private String occupation;
    @OneToMany(mappedBy = "discoverer", fetch = FetchType.EAGER)
    private List<Moon> moons;

    public String getFirstName() {
        return firstName;
    }


    public List<Moon> getMoons() {
        return moons;
    }

    public void setMoons(List<Moon> moons) {
        this.moons = moons;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getLastName() {
        return lastName;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
}
