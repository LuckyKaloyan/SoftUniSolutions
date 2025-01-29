package SoftUniJavaOOP.OOP.InterfacesAndAbstraction.Lab.CarShopExtend;
import SoftUniJavaOOP.OOP.InterfacesAndAbstraction.Lab.CarShopExtend.Car;
public class Seat extends CarImpl implements Sellable {

    private Double price;

    public  Seat(String model, String color, Integer horsePower, String countryProduced){
        super(model, color, horsePower, countryProduced);
    }
    public  Seat(String model, String color, Integer horsePower, String countryProduced, Double price){
        super(model, color, horsePower, countryProduced);
        this.price = price;
    }


    @Override
    public Integer getHorsePower() {
        return horsePower;
    }

    @Override
    public String getColor() {
        return color;
    }

    public String getCountryProduced() {
        return countryProduced;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return String.format("This is %s produced in %s and have %d tires", getModel(), getCountryProduced(), tires);
    }

    @Override
    public Double getPrice() {
        return price;
    }
}
