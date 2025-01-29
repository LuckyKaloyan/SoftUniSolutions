package SoftUniJavaOOP.ExamPreparationOOP.aquarium.repositories;

import SoftUniJavaOOP.ExamPreparationOOP.aquarium.entities.decorations.Decoration;

public interface Repository  {
    void add(Decoration decoration);

    boolean remove(Decoration decoration);

    Decoration findByType(String type);
}
