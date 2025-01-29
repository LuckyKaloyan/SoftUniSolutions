package easterRaces.interfaces;

import easterRaces.entities.cars.Car;

public class CarRepository extends BaseRepository<Car> {
    @Override
    protected String getName(Car car) {
        return car.getModel();
    }
}
