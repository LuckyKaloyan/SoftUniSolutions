package softuni.exam.models.entity;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "sellers")
public class Seller extends BaseEntity {
    @Column(name = "first_name", nullable = false)
    private String firstName;
    @Column(name = "last_name", unique = true, nullable = false)
    private String lastName;
    @Column(name = "personal_number", nullable = false)
    private String personalNumber;
    @OneToMany(mappedBy = "seller",fetch = FetchType.EAGER)
    private List<Sale> sales;

    public List<Sale> getSales() {
        return sales;
    }

    public void setSales(List<Sale> sales) {
        this.sales = sales;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPersonalNumber() {
        return personalNumber;
    }

    public void setPersonalNumber(String personalNumber) {
        this.personalNumber = personalNumber;
    }
}
