package SoftUniJavaOOP.OOP.Encapsulation.Exercise.Box;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Box box = new Box(Double.parseDouble(scanner.nextLine()),Double.parseDouble(scanner.nextLine()),Double.parseDouble(scanner.nextLine()));

        System.out.printf("Surface Area - %.2f%n",box.calculateSurfaceArea());
        System.out.printf("Lateral Surface Area - %.2f%n",box.calculateLateralSurfaceArea());
        System.out.printf("Volume - %.2f%n",box.calculateVolume());

    }
}
