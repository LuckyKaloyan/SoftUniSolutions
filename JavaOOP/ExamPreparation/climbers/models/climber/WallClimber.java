package SoftUniJavaOOP.ExamPreparationOOP.climbers.models.climber;

public class WallClimber extends BaseClimber {
    private static final double INITIAL_STRENGTH = 90.0;

    public WallClimber(String name) {
        super(name, INITIAL_STRENGTH);
    }

    @Override
    public void climb() {
        double newStrength = getStrength() - 30;
        if (newStrength < 0) {
            newStrength = 0;
        }
        setStrength(newStrength);

    }
}