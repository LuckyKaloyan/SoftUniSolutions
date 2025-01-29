package SoftUniJavaOOP.ExamPreparationOOP.vehicleShop.repositories;

import SoftUniJavaOOP.ExamPreparationOOP.vehicleShop.models.vehicle.Vehicle;

import java.util.ArrayList;
import java.util.Collection;

public class VehicleRepository {
    Collection<Vehicle> vehicles;


    public VehicleRepository(){
        vehicles = new ArrayList<>();
    }

    public void add(Vehicle vehicle){
        vehicles.add(vehicle);
    }
    public boolean remove(Vehicle vehicle){
        return vehicles.remove(vehicle);
    }

    public Vehicle findByName(String name){
        for(Vehicle vehicle :vehicles){
            if(vehicle.getName().equals(name)){
                return vehicle;
            }
        }
        return null;
    }
    public Collection<Vehicle> getWorkers(){
        return vehicles;
    }

}
