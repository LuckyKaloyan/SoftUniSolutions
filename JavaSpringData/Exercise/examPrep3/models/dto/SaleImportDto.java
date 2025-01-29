package softuni.exam.models.dto;
import com.google.gson.annotations.Expose;
import javax.persistence.Column;


public class SaleImportDto {
    @Expose
    @Column
    private boolean discounted;
    @Expose
    @Column(length = 7)
    private String number;
    @Expose
    @Column
    private String saleDate;
    @Expose
    @Column
    private long seller;

    public boolean isDiscounted() {
        return discounted;
    }

    public void setDiscounted(boolean discounted) {
        this.discounted = discounted;
    }

    public String  getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(String  saleDate) {
        this.saleDate = saleDate;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public long getSeller() {
        return seller;
    }

    public void setSeller(long seller) {
        this.seller = seller;
    }
}
