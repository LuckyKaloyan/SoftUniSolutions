package softuni.exam.models.dto;

import org.apache.tomcat.jni.Library;
import org.hibernate.validator.constraints.Length;
import softuni.exam.models.entity.Book;
import softuni.exam.models.entity.LibraryMember;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "borrowing_record")
public class BorrowingRecordImportDto {

    @XmlElement(name = "borrow_date")
    private String borrowDate;
    @XmlElement(name = "return_date")
    private String returnDate;
    @XmlElement(name = "remarks")
    @Length(min = 3, max = 100)
    private String remarks;
    @XmlElement
    private Book book;
    @XmlElement
    private LibraryMember member;

    public String getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(String borrowDate) {
        this.borrowDate = borrowDate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public LibraryMember getMember() {
        return member;
    }

    public void setMember(LibraryMember member) {
        this.member = member;
    }
}
