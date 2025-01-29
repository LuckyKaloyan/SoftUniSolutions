package SoftUniJavaOOP.ExamPreparationOOP.robotService.repositories;

import SoftUniJavaOOP.ExamPreparationOOP.robotService.entities.supplements.Supplement;

public interface Repository {

    void addSupplement(Supplement supplement);

    boolean removeSupplement(Supplement supplement);

    Supplement findFirst(String type);
}
