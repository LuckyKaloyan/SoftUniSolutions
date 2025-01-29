package EntryModule.FirstStepsInCoding.Exercise;

import java.util.Scanner;
public class BasketBall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int tax = Integer.parseInt(scanner.nextLine());

        double sum = tax+(0.60*tax)+(0.8*(0.60*tax))+(0.25*(0.8*(0.60*tax)))+(0.20*(0.25*(0.8*(0.60*tax))));
        System.out.println(sum);



    }
}
