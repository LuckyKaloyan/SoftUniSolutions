package EntryModule.ConditionalStatements.Lab;

import java.util.Scanner;
public class SpeedInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double n = Double.parseDouble(scanner.nextLine());


        if(n<=10){
            System.out.println("slow");
        }
        if(n>10 && n<=50){
            System.out.println("average");
        }
        if(n>50 && n<=150){
            System.out.println("fast");
        }
        if(n>150 && n<=1000){
            System.out.println("ultra fast");
        }
        if(n>1000){
            System.out.println("extremely fast");
        }







    }
}
