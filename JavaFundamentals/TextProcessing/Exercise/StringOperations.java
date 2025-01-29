package FundamentalsModule.TextProcessing.Exercise;

import java.util.Scanner;
import java.math.BigDecimal;

public class StringOperations {
    public static BigDecimal calculateResult(String str) {
        BigDecimal total = BigDecimal.ZERO;
        int i = 0;

        while (i < str.length()) {
            char ch = str.charAt(i);
            i++;

            String operation;
            if (Character.isUpperCase(ch)) {
                operation = "divide";
            } else {
                operation = "multiply";
            }

            StringBuilder numberStr = new StringBuilder();
            while (i < str.length() && Character.isDigit(str.charAt(i))) {
                numberStr.append(str.charAt(i));
                i++;
            }
            int number = Integer.parseInt(numberStr.toString());

            int position = Character.isUpperCase(ch) ? (ch - 'A' + 1) : (ch - 'a' + 1);

            if ("divide".equals(operation)) {
                total = total.add(BigDecimal.valueOf(number).divide(BigDecimal.valueOf(position)));
            } else {
                total = total.add(BigDecimal.valueOf(number).multiply(BigDecimal.valueOf(position)));
            }

            i++;

            if (i < str.length()) {
                char nextChar = str.charAt(i);

                if (Character.isUpperCase(nextChar)) {
                    total = total.subtract(BigDecimal.valueOf(nextChar - 'A' + 1));
                } else {
                    total = total.add(BigDecimal.valueOf(nextChar - 'a' + 1));
                }
                i++;
            }
        }

        return total;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        String[] strings = input.split("\\s+");
        BigDecimal totalSum = BigDecimal.ZERO;

        for (String str : strings) {
            totalSum = totalSum.add(calculateResult(str));
        }

        totalSum = totalSum.setScale(2, BigDecimal.ROUND_HALF_UP);

        System.out.println(totalSum);
    }
}
