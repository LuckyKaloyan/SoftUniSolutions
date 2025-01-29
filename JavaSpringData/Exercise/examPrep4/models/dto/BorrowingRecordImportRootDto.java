package softuni.exam.models.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "borrowing_records")
public class BorrowingRecordImportRootDto {

    @XmlElement(name = "borrowing_record")
    List<BorrowingRecordImportDto> borrowingRecordImportDtos;

    public List<BorrowingRecordImportDto> getBorrowingRecordImportDtos() {
        return borrowingRecordImportDtos;
    }

    public void setBorrowingRecordImportDtos(List<BorrowingRecordImportDto> borrowingRecordImportDtos) {
        this.borrowingRecordImportDtos = borrowingRecordImportDtos;
    }
}
