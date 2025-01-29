package SoftUniJavaOOP.OOP.Polymorphism.Exercise.Vehicles;

import java.text.DecimalFormat;

public class Car {
    private double fuel;
    private double consumption;

    public Car(double fuel, double consumption){
        setFuel(fuel);
        setConsumption(consumption);
    }

        private void setFuel(double fuel){
        this.fuel = fuel;
        }
        private void setConsumption(double consumption){
        this.consumption = consumption+0.9;
        }


    public double getFuel() {
        return fuel;
    }

    public void drive(double distance){
      if(fuel<consumption*distance){
          System.out.println("Car needs refueling");
      }else{
          fuel = fuel-(consumption*distance);
          DecimalFormat decimalFormat = new DecimalFormat("#.##");
          String output = decimalFormat.format(distance);
          System.out.println("Car travelled "+output+" km");
      }


    }
    public void refuel(double liters){
        fuel = fuel+liters;
    }




}
