package softuni.exam.models.dto;

import com.google.gson.annotations.Expose;
import org.hibernate.validator.constraints.Length;

import javax.persistence.Column;


public class SellerImportDto {

    @Expose
    @Length(min = 2, max = 30)
    @Column(name = "first_name")
    private String firstName;
    @Expose
    @Length(min = 2, max = 30)
    @Column(name = "last_name")
    private String lastName;
    @Expose
    @Column(name = "personal_number")
    @Length(min = 3, max = 6)
    private String personalNumber;

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
