package SoftUniJavaOOP.ExamPreparationOOP.magicGame.models.magicians;

import SoftUniJavaOOP.ExamPreparationOOP.magicGame.models.magics.Magic;

public interface Magician {
    String getUsername();

    int getHealth();

    int getProtection();

    Magic getMagic();

    boolean isAlive();

    void takeDamage(int points);
}
