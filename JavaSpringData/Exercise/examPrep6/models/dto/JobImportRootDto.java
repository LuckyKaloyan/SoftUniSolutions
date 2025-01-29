package softuni.exam.models.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "jobs")
@XmlAccessorType(XmlAccessType.FIELD)
public class JobImportRootDto {

    @XmlElement(name = "job")
    List<JobImportDto> jobImportDtos;

    public List<JobImportDto> getJobImportDtos() {
        return jobImportDtos;
    }

    public void setJobImportDtos(List<JobImportDto> jobImportDtos) {
        this.jobImportDtos = jobImportDtos;
    }
}
