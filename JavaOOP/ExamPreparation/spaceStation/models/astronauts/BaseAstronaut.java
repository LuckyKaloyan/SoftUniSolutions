package SoftUniJavaOOP.ExamPreparationOOP.spaceStation.models.astronauts;

import SoftUniJavaOOP.ExamPreparationOOP.spaceStation.common.ExceptionMessages;
import SoftUniJavaOOP.ExamPreparationOOP.spaceStation.models.bags.Bag;

public abstract class BaseAstronaut implements Astronaut {
    private String name;
    private double oxygen;
    private Bag bag;

    public BaseAstronaut(String name, double oxygen) {
        if (name == null || name.trim().isEmpty()) {
            throw new NullPointerException(ExceptionMessages.ASTRONAUT_NAME_NULL_OR_EMPTY);
        }
        if (oxygen < 0) {
            throw new IllegalArgumentException(ExceptionMessages.ASTRONAUT_OXYGEN_LESS_THAN_ZERO);
        }
        this.name = name;
        this.oxygen = oxygen;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getOxygen() {
        return oxygen;
    }

    @Override
    public Bag getBag() {
        return bag;
    }

    @Override
    public void breath() {
        oxygen -= 10;
        if (oxygen < 0) {
            oxygen = 0;
        }
    }

    protected void setOxygen(double oxygen) {
        if (oxygen < 0) {
            throw new IllegalArgumentException(ExceptionMessages.ASTRONAUT_OXYGEN_LESS_THAN_ZERO);
        }
        this.oxygen = oxygen;
    }

    @Override
    public boolean canBreath() {
        return oxygen > 0;
    }
}
