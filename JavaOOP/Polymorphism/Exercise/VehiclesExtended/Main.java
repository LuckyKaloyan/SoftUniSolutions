package SoftUniJavaOOP.OOP.Polymorphism.Exercise.VehiclesExtended;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] carInput = scanner.nextLine().split(" ");
        String[] truckInput = scanner.nextLine().split(" ");
        String[] busInput = scanner.nextLine().split(" ");
        Car car = new Car(Double.parseDouble(carInput[1]),Double.parseDouble(carInput[2]),Double.parseDouble(carInput[3]));
        Truck truck = new Truck(Double.parseDouble(truckInput[1]),Double.parseDouble(truckInput[2]),Double.parseDouble(carInput[3]));
        Bus bus = new Bus(Double.parseDouble(busInput[1]),Double.parseDouble(busInput[2]),Double.parseDouble(busInput[3]));
        int c = Integer.parseInt(scanner.nextLine());
        for(int i=0; i<c; i++){
            String[] command = scanner.nextLine().split(" ");
            if(command[1].equals("Car")){
                if(command[0].equals("Drive")){
                    car.drive(Double.parseDouble(command[2]));
                }else if (command[0].equals("Refuel")){
                    car.refuel(Double.parseDouble(command[2]));
                }
            }else if(command[1].equals("Truck")){
                if(command[0].equals("Drive")){
                    truck.drive(Double.parseDouble(command[2]));
                }else if (command[0].equals("Refuel")){
                    truck.refuel(Double.parseDouble(command[2]));
                }
            }else{
                if(command[0].equals("Drive")){
                    bus.drive(Double.parseDouble(command[2]));
                }else if(command[0].equals("DriveEmpty")){
                    bus.driveEmpty(Double.parseDouble(command[2]));
                }else if (command[0].equals("Refuel")){
                    bus.refuel(Double.parseDouble(command[2]));
                }
            }
        }
        System.out.printf("Car: %.2f%nTruck: %.2f%nBus: %.2f", car.getFuel(),truck.getFuel(),bus.getFuel());
    }
}