package EntryModule.FirstStepsInCoding.Exercise;

import java.util.Scanner;
public class FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pile = Integer.parseInt(scanner.nextLine());
        int riba = Integer.parseInt(scanner.nextLine());
        int veg = Integer.parseInt(scanner.nextLine());



        double sum = ((pile*10.35+riba*12.40+veg*8.15)*1.20)+2.50;
        System.out.println(sum);


    }
}
