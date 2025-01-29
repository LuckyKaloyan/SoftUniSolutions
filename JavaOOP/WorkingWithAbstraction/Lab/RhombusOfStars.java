package SoftUniJavaOOP.OOP.WorkingWithAbstraction.Lab;

import java.util.Scanner;

public class RhombusOfStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());

        if (input == 1) {
            System.out.println("*");
        } else {
            for (int i = 0; i < input * 2 - 1; i++) {
                for (int j = 0; j < Math.abs(input - 1 - i); j++) {
                    System.out.print(" ");
                }
                for (int k = 0; k < 2 * (input - Math.abs(input - 1 - i)) - 1; k++) {
                    if (k % 2 == 0) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}