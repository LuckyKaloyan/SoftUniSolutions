package EntryModule.ConditionalStatements.Exercise;

import java.util.Scanner;
public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double budget = Double.parseDouble(scanner.nextLine());
        int statists = Integer.parseInt(scanner.nextLine());
        double clothes = Double.parseDouble(scanner.nextLine());

        if(statists>=150){clothes=clothes*0.9;}
        double decor = 0.1*budget;
        double clothestotal = clothes*statists;

        if(clothestotal+decor<=budget){
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", budget-(clothestotal+decor));
        }
        if(clothestotal+decor>budget){
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", (clothestotal+decor)-budget);
        }





    }
}
