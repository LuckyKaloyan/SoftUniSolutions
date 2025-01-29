package softuni.exam.models.dto;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.hibernate.validator.constraints.Length;

public class CountryImportDto {


    @Expose
    @Length(min = 2, max = 30)
    private String name;
    @Expose
    @Length(min = 2, max = 19)
    @SerializedName("countryCode")
    private String code;

    @Expose
    @Length(min = 2, max = 19)
    private String currency;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
