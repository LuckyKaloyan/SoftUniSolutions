package SoftUniJavaOOP.ExamPreparationOOP.viceCity.models.players;

import SoftUniJavaOOP.ExamPreparationOOP.viceCity.models.guns.Gun;
import SoftUniJavaOOP.ExamPreparationOOP.viceCity.repositories.interfaces.Repository;

public interface Player {
    String getName();

    int getLifePoints();

    boolean isAlive();

    Repository<Gun> getGunRepository();

    void takeLifePoints(int points);
}
