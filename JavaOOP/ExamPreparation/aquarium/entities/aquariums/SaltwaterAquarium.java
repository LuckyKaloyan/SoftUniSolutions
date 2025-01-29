package SoftUniJavaOOP.ExamPreparationOOP.aquarium.entities.aquariums;

import SoftUniJavaOOP.ExamPreparationOOP.aquarium.entities.fish.SaltwaterFish;

public class SaltwaterAquarium extends BaseAquarium {
    private static final int DEFAULT_CAPACITY = 25;

    public SaltwaterAquarium(String name) {
        super(name, DEFAULT_CAPACITY);
    }


    public void addFish(SaltwaterFish fish) {
        super.addFish(fish);
    }
}