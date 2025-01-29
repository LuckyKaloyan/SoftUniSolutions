package easterRaces.entities.cars;

public abstract class BaseCar implements Car {
    private String model;
    private int horsePower;
    private double cubicCentimeters;

    public BaseCar(String model, int horsePower, double cubicCentimeters) {
        if (model == null || model.trim().isEmpty() || model.length() < 4) {
            throw new IllegalArgumentException(String.format("Model %s cannot be less than 4 symbols.", model));
        }
        this.model = model;

        if (horsePower < getMinHorsePower() || horsePower > getMaxHorsePower()) {
            throw new IllegalArgumentException(String.format("Invalid horse power: %d.", horsePower));
        }
        this.horsePower = horsePower;

        this.cubicCentimeters = cubicCentimeters;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public int getHorsePower() {
        return horsePower;
    }

    @Override
    public double getCubicCentimeters() {
        return cubicCentimeters;
    }

    @Override
    public double calculateRacePoints(int laps) {
        return cubicCentimeters / horsePower * laps;
    }

    protected abstract int getMinHorsePower();

    protected abstract int getMaxHorsePower();
}
