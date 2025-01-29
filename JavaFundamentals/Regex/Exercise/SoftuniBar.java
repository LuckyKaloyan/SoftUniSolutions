package FundamentalsModule.Regex.Exercise;

import java.util.*;
import java.util.regex.*;

public class SoftuniBar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String regex =  "%(?<customerName>[A-Z][a-z]+)%([^\\|$%\\.]*)<(?<product>\\w+)>([^\\|\\$%\\.]*)\\|(?<count>\\d+)\\|([^\\|\\$%\\.]*?)(?<price>\\d+\\.?\\d*)\\$";
        Pattern pattern = Pattern.compile(regex);


        double sum = 0;

        while (!text.equals("end of shift")) {
            Matcher matcher = pattern.matcher(text);


            if (matcher.find()) {
                String customer = matcher.group("customerName");
                String product = matcher.group("product");
                double price = 0;
                int quantity = 0;

                if (matcher.group("count") != null && matcher.group("price") != null) {
                    quantity = Integer.parseInt(matcher.group("count"));
                    price = Double.parseDouble(matcher.group("price"));
                    sum += (price * quantity);
                }

                System.out.printf("%s: %s - %.2f%n", customer, product, (price * quantity));
            }

            text = scanner.nextLine();
        }

        scanner.close();
        System.out.printf("Total income: %.2f", sum);
    }
}
