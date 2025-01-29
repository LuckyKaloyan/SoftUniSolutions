package SoftUniJavaOOP.OOP.WorkingWithAbstraction.Lab.HotelReservation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        PriceCalculator calculator = new PriceCalculator(Double.parseDouble(input[0]),Integer.parseInt(input[1]),input[2],input[3]);
        System.out.println(calculator.calculated(calculator));
    }
}
