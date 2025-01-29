package SoftUniJavaOOP.ExamPreparationOOP.magicGame.repositories.interfaces;

import SoftUniJavaOOP.ExamPreparationOOP.magicGame.models.magicians.Magician;

import java.util.Collection;

public interface MagicianRepository<T> {
    Collection<T> getData();

    void addMagician(Magician model);

    boolean removeMagician(Magician model);

    T findByUsername(String name);
}
