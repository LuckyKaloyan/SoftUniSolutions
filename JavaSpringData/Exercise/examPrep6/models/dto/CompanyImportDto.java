package softuni.exam.models.dto;

import org.hibernate.validator.constraints.Length;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "company")
@XmlAccessorType(XmlAccessType.FIELD)
public class CompanyImportDto {

    @XmlElement
    @Length(min = 2, max = 40)
    private String companyName;
    @XmlElement
    private String dateEstablished;
    @XmlElement
    @Length(min = 2, max = 30)
    private String website;
    @XmlElement
    private long countryId;


    public String getName() {
        return companyName;
    }

    public void setName(String name) {
        this.companyName = name;
    }

    public String getDateEstablished() {
        return dateEstablished;
    }

    public void setDateEstablished(String dateEstablished) {
        this.dateEstablished = dateEstablished;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public long getCountryId() {
        return countryId;
    }

    public void setCountryId(long countryId) {
        this.countryId = countryId;
    }
}
