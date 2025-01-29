package SoftUniJavaOOP.ExamPreparationOOP.spaceStation.models.mission;

import SoftUniJavaOOP.ExamPreparationOOP.spaceStation.models.astronauts.Astronaut;
import SoftUniJavaOOP.ExamPreparationOOP.spaceStation.models.planets.Planet;

import java.util.Collection;

public interface Mission {
    void explore(Planet planet, Collection<Astronaut> astronauts);
}
