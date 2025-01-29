package SoftUniJavaOOP.ExamPreparationOOP.vehicleShop.models.shop;

import SoftUniJavaOOP.ExamPreparationOOP.vehicleShop.models.vehicle.Vehicle;
import SoftUniJavaOOP.ExamPreparationOOP.vehicleShop.models.worker.Worker;

public interface Shop {
    void make(Vehicle vehicle, Worker worker);
}
