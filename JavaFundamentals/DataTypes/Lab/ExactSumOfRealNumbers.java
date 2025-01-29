package FundamentalsModule.DataTypes.Lab;

import java.math.BigDecimal;
import java.util.Scanner;

public class ExactSumOfRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());
        BigDecimal hal = BigDecimal.ZERO;
        for (int i = 0; i < input; i++) {
            hal = hal.add(new BigDecimal(scanner.nextLine()));}

        System.out.println(hal);
    }
}