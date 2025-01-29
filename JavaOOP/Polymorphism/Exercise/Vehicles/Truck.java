package SoftUniJavaOOP.OOP.Polymorphism.Exercise.Vehicles;

import java.text.DecimalFormat;

public class Truck {
    private double fuel;
    private double consumption;

    public Truck(double fuel, double consumption){
        setFuel(fuel);
        setConsumption(consumption);
    }

    private void setFuel(double fuel){
        this.fuel = fuel;
    }
    private void setConsumption(double consumption){
        this.consumption = consumption+1.6;
    }



    public void drive(double distance){
        if(fuel<consumption*distance){
            System.out.println("Truck needs refueling");
        }else{
            fuel = fuel-(consumption*distance);
            DecimalFormat decimalFormat = new DecimalFormat("#.##");
            String output = decimalFormat.format(distance);
            System.out.println("Truck travelled "+output+" km");
        }


    }
    public void refuel(double liters){
        fuel = fuel+liters*0.95;
    }

    public double getFuel() {
        return fuel;
    }
}
