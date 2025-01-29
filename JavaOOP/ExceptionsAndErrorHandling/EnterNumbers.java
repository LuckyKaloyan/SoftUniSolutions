package SoftUniJavaOOP.OOP.ExceptionsAndErrorHandling;

import java.util.Scanner;

public class EnterNumbers {
    public static void main(String[] args) {
        int[] validNumbers = readNumbers(1, 100, 10);
        for (int i = 0; i < validNumbers.length; i++) {
            System.out.print(validNumbers[i]);
            if (i < validNumbers.length - 1) {
                System.out.print(", ");
            }
        }
    }
    public static int[] readNumbers(int start, int end, int count) {
        Scanner scanner = new Scanner(System.in);
        int[] validNumbers = new int[count];
        int counter = 0;
        while (counter < count) {
            try {
                int num = Integer.parseInt(scanner.nextLine());
                if (num > start && num < end) {
                    validNumbers[counter++] = num;
                    start = num;
                } else {
                    System.out.println("Your number is not in range " + (start) + " - " + (end) + "!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid Number!");
            }
        }
        return validNumbers;
    }
}
