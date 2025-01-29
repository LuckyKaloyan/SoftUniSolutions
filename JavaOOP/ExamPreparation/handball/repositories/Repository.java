package SoftUniJavaOOP.ExamPreparationOOP.handball.repositories;

import SoftUniJavaOOP.ExamPreparationOOP.handball.entities.equipment.Equipment;

public interface Repository {
    void add(Equipment equipment);
    boolean remove(Equipment equipment);
    Equipment findByType(String type);
}
