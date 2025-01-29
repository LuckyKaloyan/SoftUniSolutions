package FundamentalsModule.TextProcessing.Exercise;

import java.util.Scanner;

public class LettersChangeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();

        char firstLetter;
        char lastLetter;
        double number;
        double total = 0;

        String[] array = word.split("\\s+");

        for (int i = 0; i < array.length; i++) {
            if (!array[i].matches(".*\\d.*")) {
                continue;
            }

            if (array[i].length() > 3) {
                firstLetter = array[i].charAt(0);
                lastLetter = array[i].charAt(array[i].length() - 1);
                String numberStr = array[i].substring(1, array[i].length() - 1);
                if (numberStr.matches("-?\\d+(\\.\\d+)?")) {
                    number = Double.parseDouble(numberStr);
                } else {
                    System.out.println("Invalid number format: " + numberStr);
                    continue;
                }
            } else {
                firstLetter = array[i].charAt(0);
                lastLetter = array[i].charAt(1);
                String numberStr = array[i].substring(1);
                if (numberStr.matches("-?\\d+(\\.\\d+)?")) {
                    number = Double.parseDouble(numberStr);
                } else {
                    continue;
                }
            }

            if (Character.isUpperCase(firstLetter)) {
                number = number / (firstLetter - 'A' + 1);
            } else {
                number = number * (firstLetter - 'a' + 1);
            }

            if (Character.isUpperCase(lastLetter)) {
                number = number - (lastLetter - 'A' + 1);
            } else {
                number = number + (lastLetter - 'a' + 1);
            }

            total = total + number;
        }

        System.out.printf("%.2f%n", total);
    }
}
