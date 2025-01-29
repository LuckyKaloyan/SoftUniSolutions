package FundamentalsModule.TextProcessing.Exercise;

import java.util.Scanner;

public class MultiplyBigNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String num1 = scanner.nextLine();
        int num2 = Integer.parseInt(scanner.nextLine());
        String newNumber = "";

        int nextOver = 0;
        int stayHere;

        for (int i = num1.length() - 1; i >= 0; i--) {
            int currentDigit = Integer.parseInt(String.valueOf(num1.charAt(i)));
            int product = currentDigit * num2 + nextOver;
            stayHere = product % 10;
            nextOver = product / 10;

            newNumber = String.valueOf(stayHere) + newNumber;
        }
        if (nextOver > 0) {
            newNumber = String.valueOf(nextOver) + newNumber;
        }

        System.out.println(newNumber);
    }
}
