package SoftUniJavaOOP.OOP.InterfacesAndAbstraction.Lab.CarShopExtend;

public class Audi extends CarImpl implements Rentable{
    Integer minRentDay;
    Double pricePerDay;

    public Audi(String model, String color, Integer horsePower, String countryProduced) {
        super(model, color, horsePower, countryProduced);
    }

    public Audi(String model, String color, Integer horsePower, String countryProduced, Integer minRentDay, Double pricePerDay) {
        super(model, color, horsePower, countryProduced);
        this.minRentDay = minRentDay;
        this.pricePerDay = pricePerDay;
    }

    @Override
    public Integer getMinRentDay() {
        return minRentDay;
    }

    @Override
    public Double getPricePerDay() {
        return pricePerDay;
    }
    public String toString() {
        return String.format("This is %s produced in %s and have %d tires", getModel(), getCountryProduced(), tires);
    }
}
