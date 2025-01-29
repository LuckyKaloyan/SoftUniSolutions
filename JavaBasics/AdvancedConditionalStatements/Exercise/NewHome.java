package EntryModule.AdvancedConditionalStatements.Exercise;

import java.util.Scanner;
public class NewHome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String flowersname = scanner.nextLine();
        int number = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());
        double price;

        if (number > 0) {
            switch (flowersname) {
                case "Roses":
                    if (number > 80) {
                        price = 4.5;
                    } else {
                        price = 5.00;
                    }
                    if (Math.abs(price * number) <= budget) {
                        System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", number, flowersname, budget - (price * number));
                    } else {
                        System.out.printf("Not enough money, you need %.2f leva more.", (price * number) - budget);
                    }
                    break;
                case "Dahlias":
                    if (number > 90) {
                        price = 3.23;
                    } else {
                        price = 3.80;
                    }
                    if (Math.abs(price * number) <= budget) {
                        System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", number, flowersname, budget - (price * number));
                    } else {
                        System.out.printf("Not enough money, you need %.2f leva more.", (price * number) - budget);
                    }
                    break;
                case "Tulips":
                    if (number > 80) {
                        price = 2.38;
                    } else {
                        price = 2.80;
                    }
                    if (Math.abs(price * number) <= budget) {
                        System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", number, flowersname, budget - (price * number));
                    } else {
                        System.out.printf("Not enough money, you need %.2f leva more.", (price * number) - budget);
                    }
                    break;
                case "Narcissus":
                    if (number < 120) {
                        price = 3.45;
                    } else {
                        price = 3.00;
                    }
                    if (Math.abs(price * number) <= budget) {
                        System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", number, flowersname, budget - (price * number));
                    } else {
                        System.out.printf("Not enough money, you need %.2f leva more.", (price * number) - budget);
                    }
                    break;
                case "Gladiolus":
                    if (number < 80) {
                        price = 3.00;
                    } else {
                        price = 2.50;
                    }
                    if (Math.abs(price * number) <= budget) {
                        System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", number, flowersname, budget - (price * number));
                    } else {
                        System.out.printf("Not enough money, you need %.2f leva more.", (price * number) - budget);
                    }
                    break;

            }
        }
    }}
