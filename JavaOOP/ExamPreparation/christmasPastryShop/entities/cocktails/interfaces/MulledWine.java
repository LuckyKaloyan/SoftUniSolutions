package SoftUniJavaOOP.ExamPreparationOOP.christmasPastryShop.entities.cocktails.interfaces;

public class MulledWine extends BaseCocktail {
    private static final double mulledWinePrice = 3.50;

    public MulledWine(String name, String brand, int size) {
        super(name, size, mulledWinePrice, brand);
    }
}

