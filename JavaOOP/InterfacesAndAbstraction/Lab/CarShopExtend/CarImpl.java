package SoftUniJavaOOP.OOP.InterfacesAndAbstraction.Lab.CarShopExtend;

public class CarImpl implements Car{
    String model;
    String color;
    Integer horsePower;
    String countryProduced;

    public CarImpl(String model, String color, Integer horsePower, String countryProduced){
        this.model = model;
        this.color = color;
        this.horsePower = horsePower;
        this.countryProduced = countryProduced;
    }

    @Override
    public String getCountryProduced() {
        return countryProduced;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public Integer getHorsePower() {
        return horsePower;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
