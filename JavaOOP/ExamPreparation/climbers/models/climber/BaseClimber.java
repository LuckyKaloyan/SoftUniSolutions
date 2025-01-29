package SoftUniJavaOOP.ExamPreparationOOP.climbers.models.climber;

import SoftUniJavaOOP.ExamPreparationOOP.climbers.models.roster.Roster;

public abstract class BaseClimber implements Climber {
    private String name;
    private double strength;
    private Roster roster;

    public BaseClimber(String name, double strength) {
        if (name == null || name.trim().isEmpty()) {
            throw new NullPointerException("Climber name cannot be null or empty.");
        }
        if (strength < 0) {
            throw new IllegalArgumentException("Cannot create Climber with negative strength.");
        }
        this.name = name;
        this.strength = strength;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getStrength() {
        return strength;
    }

    @Override
    public boolean canClimb() {
        return strength > 0;
    }

    @Override
    public Roster getRoster() {
        return roster;
    }

    public void setStrength(double strength) {
        this.strength = strength;
    }

    @Override
    public void climb() {

    }
}