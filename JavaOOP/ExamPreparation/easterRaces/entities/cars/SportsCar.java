package easterRaces.entities.cars;

public class SportsCar extends BaseCar {
    private static final int MIN_HORSE_POWER = 250;
    private static final int MAX_HORSE_POWER = 450;
    private static final double CUBIC_CENTIMETERS = 3000;

    public SportsCar(String model, int horsePower) {
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
