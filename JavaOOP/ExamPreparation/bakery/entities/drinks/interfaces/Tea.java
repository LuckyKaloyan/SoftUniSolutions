package SoftUniJavaOOP.ExamPreparationOOP.bakery.entities.drinks.interfaces;

public class Tea extends BaseDrink {
    private static final double TEA_PRICE = 2.50;

    public Tea(String name, String brand, int portion) {
        super(name, portion, TEA_PRICE, brand);
    }
}