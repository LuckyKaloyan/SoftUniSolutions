package easterRaces.interfaces;

import easterRaces.entities.drivers.Driver;

public class DriverRepository extends BaseRepository<Driver> {
    @Override
    protected String getName(Driver driver) {
        return driver.getName();
    }
}
