package FundamentalsModule.BasicSyntaxConditionalStatements.Exercise;

import java.util.Scanner;
public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double input = Double.parseDouble(scanner.nextLine());
        String first = scanner.nextLine();
        String second = scanner.nextLine();
        double result = 0;


        if(first.equals("Students")){if(second.equals("Friday")){result=8.45*input;}}
        if(first.equals("Students")){if(second.equals("Saturday")){result=9.80*input;}}
        if(first.equals("Students")){if(second.equals("Sunday")){result=(10.46*input);}}
        if(first.equals("Students")){if(input>=30){result=result*0.85;}}

        if(first.equals("Business")){if(second.equals("Friday")){ if(input>=100){input=input-10;}result=10.90*input;}}
        if(first.equals("Business")){if(second.equals("Saturday")){ if(input>=100){input=input-10;}result=15.60*input;}}
        if(first.equals("Business")){if(second.equals("Sunday")){ if(input>=100){input=input-10;}result=16*input;}}

        if(first.equals("Regular")){if(second.equals("Friday")){result=(15*input);}}
        if(first.equals("Regular")){if(second.equals("Saturday")){result=20*input;}}
        if(first.equals("Regular")){if(second.equals("Sunday")){result=(22.50*input);}}
        if(first.equals("Regular")){if(input>=10 && input<=20){result=result*0.95;}}


        System.out.printf("Total price: %.2f", result);


    }
}
