package SoftUniJavaOOP.JavaAdvanced.DefiningClasses.Lab.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbers = Integer.parseInt(scanner.nextLine());

        List<Car> cars = new ArrayList<>();
        String word = scanner.nextLine();
        for(int i=0; i<numbers; i++){
            String[] splitted = word.split(" ");
            if(splitted.length==1){
                Car car = new Car(splitted[0]);
                cars.add(car);
            }else{
                Car car = new Car(splitted[0],splitted[1],Integer.parseInt(splitted[2]));
                cars.add(car);
            }
            word = scanner.nextLine();
        }
        for (Car car:cars){
            System.out.printf(car.toString());
        }



    }
}