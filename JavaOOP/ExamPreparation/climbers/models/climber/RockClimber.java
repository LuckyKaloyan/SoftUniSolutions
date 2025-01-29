package SoftUniJavaOOP.ExamPreparationOOP.climbers.models.climber;

public class RockClimber extends BaseClimber {
    private static final double INITIAL_STRENGTH = 120.0;

    public RockClimber(String name) {
        super(name, INITIAL_STRENGTH);
    }

    @Override
    public void climb() {
        double newStrength = getStrength() - 60;
        setStrength(newStrength);
    }
}