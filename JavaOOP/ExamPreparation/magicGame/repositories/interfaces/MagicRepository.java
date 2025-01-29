package SoftUniJavaOOP.ExamPreparationOOP.magicGame.repositories.interfaces;

import SoftUniJavaOOP.ExamPreparationOOP.magicGame.models.magics.Magic;

import java.util.Collection;

public interface MagicRepository<T> {
    Collection<T> getData();

    void addMagic(Magic model);

    boolean removeMagic(Magic model);

    T findByName(String name);
}
