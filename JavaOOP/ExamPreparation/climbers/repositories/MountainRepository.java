package SoftUniJavaOOP.ExamPreparationOOP.climbers.repositories;

import SoftUniJavaOOP.ExamPreparationOOP.climbers.models.mountain.Mountain;

import java.util.Collection;

public interface MountainRepository {
    void add(Mountain mountain);

    boolean remove(Mountain mountain);

    Mountain byName(String name);

    Collection<Mountain> getCollection();
}