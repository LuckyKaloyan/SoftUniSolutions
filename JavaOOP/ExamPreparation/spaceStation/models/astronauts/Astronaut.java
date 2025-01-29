package SoftUniJavaOOP.ExamPreparationOOP.spaceStation.models.astronauts;

import SoftUniJavaOOP.ExamPreparationOOP.spaceStation.models.bags.Bag;

public interface Astronaut {
    String getName();

    double getOxygen();

    boolean canBreath();

    Bag getBag();

    void breath();
}
