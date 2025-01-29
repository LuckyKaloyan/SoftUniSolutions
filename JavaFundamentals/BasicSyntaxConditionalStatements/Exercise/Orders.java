package FundamentalsModule.BasicSyntaxConditionalStatements.Exercise;

import java.util.Scanner;
public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        int number = Integer.parseInt(scanner.nextLine());
        double result = 0;


        if(word.equals("coffee")){result=number*1.50;}
        if(word.equals("water")){result=number*1.00;}
        if(word.equals("coke")){result=number*1.40;}
        if(word.equals("snacks")){result=number*2.00;}

        System.out.printf("%2.2f", result);







    }
}
