package SoftUniJavaOOP.OOP.Encapsulation.Exercise.AnimalFarm;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Chicken chicken = new Chicken(scanner.nextLine(),Integer.parseInt(scanner.nextLine()));
        chicken.productPerDay();


    }
}
