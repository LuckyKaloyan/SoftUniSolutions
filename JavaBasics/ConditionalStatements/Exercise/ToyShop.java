package EntryModule.ConditionalStatements.Exercise;

import java.util.Scanner;
public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double price = Double.parseDouble(scanner.nextLine());
        int puzzles = Integer.parseInt(scanner.nextLine());
        int dolls = Integer.parseInt(scanner.nextLine());
        int bears = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int trucks = Integer.parseInt(scanner.nextLine());

        int count = puzzles+dolls+bears+minions+trucks;

        double total = puzzles*2.60+dolls*3+bears*4.10+minions*8.20+trucks*2;
        if(count>=50){total=total*0.75;}

        double result = 0.90*total;
        double da = result-price;
        double ne = price-result;

        if(result>=price){
            System.out.printf("Yes! %.2f lv left.", da);
        }else System.out.printf("Not enough money! %.2f lv needed.", ne);




    }
}
