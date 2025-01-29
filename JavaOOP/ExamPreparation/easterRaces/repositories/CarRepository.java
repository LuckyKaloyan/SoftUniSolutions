package easterRaces.repositories;

import easterRaces.entities.cars.Car;
import easterRaces.interfaces.BaseRepository;

public class CarRepository extends BaseRepository<Car> {
    @Override
    protected String getName(Car car) {
        return car.getModel();
    }
}
