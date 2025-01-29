package easterRaces.entities.cars;

public class MuscleCar extends BaseCar {
    private static final int MIN_HORSE_POWER = 400;
    private static final int MAX_HORSE_POWER = 600;
    private static final double CUBIC_CENTIMETERS = 5000;

    public MuscleCar(String model, int horsePower) {
        super(model, horsePower, CUBIC_CENTIMETERS);
    }

    @Override
    protected int getMinHorsePower() {
        return MIN_HORSE_POWER;
    }

    @Override
    protected int getMaxHorsePower() {
        return MAX_HORSE_POWER;
    }
}
