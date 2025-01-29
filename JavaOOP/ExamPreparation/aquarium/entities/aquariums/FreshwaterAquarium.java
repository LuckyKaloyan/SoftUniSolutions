package SoftUniJavaOOP.ExamPreparationOOP.aquarium.entities.aquariums;

import SoftUniJavaOOP.ExamPreparationOOP.aquarium.entities.fish.FreshwaterFish;

public class FreshwaterAquarium extends BaseAquarium {
    private static final int DEFAULT_CAPACITY = 50;

    public FreshwaterAquarium(String name) {
        super(name, DEFAULT_CAPACITY);
    }

    public void addFish(FreshwaterFish fish) {
        super.addFish(fish);
    }
}