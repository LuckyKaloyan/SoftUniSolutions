package FundamentalsModule.ObjectsAndClasses.Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class VehicleCatalogue {
    String type;
    String model;
    String color;
    int horsepower;
    public VehicleCatalogue(String type, String model, String color, int horsepower){
        this.type = type;
        this.model = model;
        this.color = color;
        this.horsepower = horsepower;

    }

    public int getHorsepower() {
        return horsepower;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<VehicleCatalogue> list = new ArrayList<>();

        double cars = 0;
        int carscount = 0;
        double trucks = 0;
        int truckscount = 0;

        String word = "";
        while(!word.equals("End")){
            word = scanner.nextLine();
            if(word.equals("End")){break;}
            String[]elements = word.split(" ");

            VehicleCatalogue car = new VehicleCatalogue(elements[0], elements[1], elements[2], Integer.parseInt(elements[3]));
            if(car.getType().equals("car")){car.setType("Car");}
            if (car.getType().equals("truck")) {car.setType("Truck");}



            list.add(car);
        }
        while(!word.equals("Close the Catalogue")){
            word = scanner.nextLine();
            for(int i=0; i<list.size(); i++){
                if(word.equals(list.get(i).getModel())){
                    if(word.equals("Close the Catalogue")){break;}
                    System.out.printf("Type: %s", list.get(i).getType());
                    System.out.println();
                    System.out.printf("Model: %s", list.get(i).getModel());
                    System.out.println();
                    System.out.printf("Color: %s", list.get(i).getColor());
                    System.out.println();
                    System.out.printf("Horsepower: %s", list.get(i).getHorsepower());
                    System.out.println();
                }
            }
        }

        for(int i=0; i<list.size(); i++){
            if(list.get(i).getType().equals("Car")){
                cars = cars + list.get(i).getHorsepower();
                carscount++;
            }else{
                trucks = trucks + list.get(i).getHorsepower();
                truckscount++;
            }

        }


        cars = cars/carscount;
        trucks = trucks/truckscount;



        if(Double.isNaN(cars)){
            System.out.println("Cars have average horsepower of: 0.00.");
        }else{System.out.printf("Cars have average horsepower of: %.2f.", cars);
            System.out.println();}

        if(Double.isNaN(trucks)){
            System.out.println("Trucks have average horsepower of: 0.00.");

        }else {
            System.out.printf("Trucks have average horsepower of: %.2f.", trucks);
        }



    }
}
