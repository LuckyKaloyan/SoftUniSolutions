package SoftUniJavaOOP.ExamPreparationOOP.goldDigger.models.discoverer;

import SoftUniJavaOOP.ExamPreparationOOP.goldDigger.models.museum.BaseMuseum;
import SoftUniJavaOOP.ExamPreparationOOP.goldDigger.models.museum.Museum;

public abstract class BaseDiscoverer implements Discoverer {
    private String name;
    private double energy;
    private Museum museum;

    public BaseDiscoverer(String name, double energy) {
        if (name == null || name.trim().isEmpty()) {
            throw new NullPointerException("Discoverer name cannot be null or empty.");
        }
        if (energy < 0) {
            throw new IllegalArgumentException("Cannot create Discoverer with negative energy.");
        }
        this.name = name;
        this.energy = energy;
        this.museum = new BaseMuseum();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getEnergy() {
        return energy;
    }

    @Override
    public boolean canDig() {
        return energy > 0;
    }

    @Override
    public Museum getMuseum() {
        return museum;
    }

    @Override
    public void dig() {
        if (energy > 0) {
            energy -= 15;
            if (energy < 0) {
                energy = 0;
            }
        }
    }
}
