package softuni.exam.models.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "companies")
@XmlAccessorType(XmlAccessType.FIELD)
public class CompanyImportRootDto {

    @XmlElement(name = "company")
    List<CompanyImportDto> companyImportDtos;

    public List<CompanyImportDto> getCompanyImportDtos() {
        return companyImportDtos;
    }

    public void setCompanyImportDtos(List<CompanyImportDto> companyImportDtos) {
        this.companyImportDtos = companyImportDtos;
    }
}
