package SoftUniJavaOOP.ExamPreparationOOP.viceCity.models.players;

public class MainPlayer extends BasePlayer {
    private static final String DEFAULT_NAME = "Tommy Vercetti";
    private static final int INITIAL_LIFE_POINTS = 100;

    public MainPlayer() {
        super(DEFAULT_NAME, INITIAL_LIFE_POINTS);
    }

    @Override
    public void takeLifePoints(int points) {

    }
}