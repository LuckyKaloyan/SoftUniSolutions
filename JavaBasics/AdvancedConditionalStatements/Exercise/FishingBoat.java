package EntryModule.AdvancedConditionalStatements.Exercise;

import java.util.Scanner;
public class FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int number = Integer.parseInt(scanner.nextLine());

        int rent = 1;
        double ratio = 1;
        double result;

        if(season.equals("Spring")){rent=3000;}
        if(season.equals("Summer")){rent=4200;}
        if(season.equals("Autumn")){rent=4200;}
        if(season.equals("Winter")){rent=2600;}

        if(number<=6){ratio=0.9;}
        if(number>=7 && 11>=number){ratio=0.85;}
        if(number>=12){ratio=0.75;}

        if(number%2==0 && !season.equals("Autumn")){ratio=ratio*0.95;}

        result=rent*ratio;
        if(result<=budget){
            System.out.printf("Yes! You have %.2f leva left.", budget-result);
        }else{System.out.printf("Not enough money! You need %.2f leva.", result-budget);}


    }
}
