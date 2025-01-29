package EntryModule.ConditionalStatements.Exercise;

import java.util.Scanner;
public class Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int videocards = Integer.parseInt(scanner.nextLine());
        int processors = Integer.parseInt(scanner.nextLine());
        int ram = Integer.parseInt(scanner.nextLine());

        int totalvideo = videocards*250;
        double totalprocessors = (totalvideo*0.35)*processors;
        double totalram = (totalvideo*0.1)*ram;
        double total = totalvideo+totalprocessors+totalram;

        if(videocards>processors){
            total=total*0.85;
        }

        if(total>budget){
            System.out.printf("Not enough money! You need %.2f leva more!", total-budget);

        }
        if(budget>=total){
            System.out.printf("You have %.2f leva left!", budget-total);
        }







    }
}
