package FundamentalsModule.Methods.Lab;

import java.util.Scanner;
public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        order(scanner.nextLine(), Integer.parseInt(scanner.nextLine()), 0);

    }
    public static void order(String word, int number, double result) {


        if(word.equals("coffee")){result=number*1.50;}
        if(word.equals("water")){result=number*1.00;}
        if(word.equals("coke")){result=number*1.40;}
        if(word.equals("snacks")){result=number*2.00;}

        System.out.printf("%2.2f", result);


    }
}
