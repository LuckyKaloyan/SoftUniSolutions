package SoftUniJavaOOP.ExamPreparationOOP.aquarium.entities.aquariums;

import SoftUniJavaOOP.ExamPreparationOOP.aquarium.entities.decorations.Decoration;
import SoftUniJavaOOP.ExamPreparationOOP.aquarium.entities.fish.Fish;

import java.util.Collection;

public interface Aquarium {
    int calculateComfort();

    String getName();

    void addFish(Fish fish);

    void removeFish(Fish fish);

    void addDecoration(Decoration decoration);

    void feed();

    String getInfo();

    Collection<Fish> getFish();

    Collection<Decoration> getDecorations();
}
