package EntryModule.FirstStepsInCoding.Lab;

import java.util.Scanner;
public class Garden {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double land = Double.parseDouble(scanner.nextLine());
        double priceland = land*7.61;
        double result = priceland*0.82;
        double discount = priceland*0.18;

        System.out.println("The final price is: "+result+" lv.");
        System.out.println("The discount is: "+discount+" lv.");



    }
}
