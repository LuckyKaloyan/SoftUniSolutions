package SoftUniJavaOOP.OOP.WorkingWithAbstraction.Exercise.CardsWithPower;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstword = scanner.nextLine();
        String secondword = scanner.nextLine();
        System.out.print("Card name: "+firstword+" of "+secondword+"; Card power: ");
        System.out.print(CardsWithPower.valueOf(firstword).getCardValue()+CardsWithPower.valueOf(secondword).getCardValue());

    }
}
