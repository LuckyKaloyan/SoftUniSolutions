package SoftUniJavaOOP.OOP.Inheritance.Exercise.Restuarant;

import java.math.BigDecimal;

public class Coffee extends HotBeverage {

   private double COFFEE_MILLILITERS = 50;
    private final BigDecimal COFFEE_PRICE = new BigDecimal("3.50");
    double caffeine;

    public Coffee(String name, BigDecimal price, double milliliters, double caffeine){
        super(name, price, milliliters);
        this.caffeine = caffeine;
    }


}

