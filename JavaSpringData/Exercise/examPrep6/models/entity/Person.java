package softuni.exam.models.entity;

import softuni.exam.models.enums.StatusType;

import javax.persistence.*;

@Entity
@Table(name = "people")
public class Person extends BaseEntity {
@Column(name = "first_name", unique = true, nullable = false)
    private String firstName;
@Column(name = "last_name", nullable = false)
    private String lastName;
@Column(unique = true, nullable = false)
    private String email;
@Column(unique = true)
    private String phone;
@Column(name = "status_type", nullable = false)
@Enumerated()
   private StatusType statusType;
@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "country_id", referencedColumnName = "id")
    private Country country;


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public StatusType getStatusType() {
        return statusType;
    }

    public void setStatusType(StatusType statusType) {
        this.statusType = statusType;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
