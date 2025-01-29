package SoftUniJavaOOP.ExamPreparationOOP.vehicleShop.models.shop;

import SoftUniJavaOOP.ExamPreparationOOP.vehicleShop.models.vehicle.Vehicle;
import SoftUniJavaOOP.ExamPreparationOOP.vehicleShop.models.worker.Worker;

public class ShopImpl implements Shop{

   public void make(Vehicle vehicle, Worker worker){

       while(vehicle.reached()){

           worker.working();
           vehicle.making();
       }
   }
}
