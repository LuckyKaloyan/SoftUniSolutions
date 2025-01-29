package FundamentalsModule.Methods.Lab;

import java.util.Scanner;
public class Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());

        int result = 0;

        if(input.equals("subtract")){result=first-second;}
        if(input.equals("add")){result=first+second;}
        if(input.equals("multiply")){result=first*second;}
        if(input.equals("divide")){result=first/second;}

        System.out.println(result);


    }
}
