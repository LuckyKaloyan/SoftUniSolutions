package easterRaces.entities.racers;

import easterRaces.entities.drivers.Driver;

import java.util.Collection;
import java.util.HashSet;

public class RaceImpl implements Race {
    private String name;
    private int laps;
    private Collection<Driver> drivers;

    public RaceImpl(String name, int laps) {
        if (name == null || name.trim().isEmpty() || name.length() < 5) {
            throw new IllegalArgumentException(String.format("Name %s cannot be less than 5 symbols.", name));
        }
        this.name = name;

        if (laps < 1) {
            throw new IllegalArgumentException("Laps cannot be less than 1.");
        }
        this.laps = laps;

        this.drivers = new HashSet<>();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getLaps() {
        return laps;
    }

    @Override
    public Collection<Driver> getDrivers() {
        return drivers;
    }

    @Override
    public void addDriver(Driver driver) {
        if (driver == null) {
            throw new IllegalArgumentException("Driver cannot be null.");
        }
        if (!driver.getCanParticipate()) {
            throw new IllegalArgumentException(String.format("Driver %s could not participate in race.", driver.getName()));
        }
        if (drivers.contains(driver)) {
            throw new IllegalArgumentException(String.format("Driver %s is already added in %s race.", driver.getName(), name));
        }
        drivers.add(driver);
    }
}
