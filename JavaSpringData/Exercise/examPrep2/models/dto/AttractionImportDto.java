package softuni.exam.models.dto;


import com.google.gson.annotations.Expose;
import jakarta.validation.constraints.Min;
import org.hibernate.validator.constraints.Length;

public class AttractionImportDto {

    @Expose
    @Length(min = 5, max = 40)
    private String name;
    @Expose
    @Length(min = 10, max = 100)
    private String description;
    @Expose
    @Length(min = 3, max = 30)
    private String type;
    @Expose
    @Min(0)
    private int elevation;
    @Expose
    private Long country;

    public String getName(){
        return this.name;
    }
    public String getDescription(){
        return this.description;
    }
    public String getType(){
        return this.type;
    }
    public int getElevation(){
        return this.elevation;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public void setType(String type){
        this.type = type;
    }
    public void setElevation(int elevation){
        this.elevation = elevation;
    }
   public void setCountry(Long country){
        this.country = country;
   }
    public Long getCountry(){
        return this.country;
    }



}
