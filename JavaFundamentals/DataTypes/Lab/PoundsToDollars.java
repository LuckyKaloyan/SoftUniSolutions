package FundamentalsModule.DataTypes.Lab;

import java.util.Scanner;
public class PoundsToDollars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double input = Double.parseDouble(scanner.nextLine());
        double result = input*1.36;
        System.out.printf("%3.3f", result);
    }
}
