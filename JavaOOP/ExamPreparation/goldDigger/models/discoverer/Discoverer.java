package SoftUniJavaOOP.ExamPreparationOOP.goldDigger.models.discoverer;

import SoftUniJavaOOP.ExamPreparationOOP.goldDigger.models.museum.Museum;

public interface Discoverer {
    String getName();

    double getEnergy();

    boolean canDig();

    Museum getMuseum();

    void dig();
}
