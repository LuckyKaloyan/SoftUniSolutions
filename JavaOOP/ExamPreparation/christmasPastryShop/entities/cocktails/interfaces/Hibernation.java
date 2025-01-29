package SoftUniJavaOOP.ExamPreparationOOP.christmasPastryShop.entities.cocktails.interfaces;

public class Hibernation extends BaseCocktail {
    private static final double hibernationPrice = 4.50;

    public Hibernation(String name, String brand, int size) {
        super(name, size, hibernationPrice, brand);
    }
}

