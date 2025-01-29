package SoftUniJavaOOP.ExamPreparationOOP.christmasPastryShop.entities.booths.interfaces;

import SoftUniJavaOOP.ExamPreparationOOP.christmasPastryShop.entities.delicacies.interfaces.Delicacy;
import SoftUniJavaOOP.ExamPreparationOOP.christmasPastryShop.entities.cocktails.interfaces.Cocktail;

public interface Booth {
    int getBoothNumber();

    int getCapacity();

    boolean isReserved();

    double getPrice();

    void reserve(int numberOfPeople);

    double getBill();

    void clear();
}
