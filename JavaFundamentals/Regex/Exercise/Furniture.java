package FundamentalsModule.Regex.Exercise;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String regex = ">>(?<furnitureName>[A-Za-z]+)<<(?<price>[0-9]+\\.?[0-9]*)!(?<quantity>[0-9]+)";
        Pattern pattern = Pattern.compile(regex);

        System.out.println("Bought furniture: ");
        double sum = 0;


        while(!text.equals("Purchase")){
            Matcher matcher = pattern.matcher(text);

            if(matcher.find()){
                String furniture = matcher.group(1);
                double price = Double.parseDouble(matcher.group(2));
                int quantity = Integer.parseInt(matcher.group(3));
                sum=sum+(price*quantity);
                System.out.println(furniture);
            }
            text = scanner.nextLine();

        }
        System.out.printf("Total money spend: %.2f", sum);


    }
}
