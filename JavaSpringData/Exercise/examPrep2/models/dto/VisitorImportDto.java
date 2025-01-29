package softuni.exam.models.dto;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import org.hibernate.validator.constraints.Length;


@XmlRootElement(name="visitor")
@XmlAccessorType(XmlAccessType.FIELD)
public class VisitorImportDto {

    @Length(min=2, max=20)
    @XmlElement(name = "first_name")
    private String firstName;
    @Length(min=2, max=20)
    @XmlElement(name = "last_name")
    private String lastName;
    @XmlElement(name = "attraction_id")
    private int attraction;
    @XmlElement(name = "personal_data_id")
    private int personalData;
    @XmlElement(name ="country_id")
    private int country;

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

    public int getAttraction() {
        return attraction;
    }

    public void setAttraction(int attraction) {
        this.attraction = attraction;
    }

    public int getPersonalData() {
        return personalData;
    }

    public void setPersonalData(int personalData) {
        this.personalData = personalData;
    }

    public int getCountry() {
        return country;
    }

    public void setCountry(int country) {
        this.country = country;
    }
}
