package sofuni.exam.models.dto;

import com.google.gson.annotations.Expose;
import jakarta.validation.constraints.Positive;
import org.hibernate.validator.constraints.Length;
import sofuni.exam.models.enums.Type;

public class PlanetImportDto {

    @Expose
    @Length(min = 3, max = 20)
    private String name;
    @Expose
    @Positive
    private int diameter;
    @Expose
    @Positive
    private long distanceFromSun;
    @Expose
    @Positive
    private double orbitalPeriod;
    @Expose
    private Type type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public long getDistanceFromSun() {
        return distanceFromSun;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}
