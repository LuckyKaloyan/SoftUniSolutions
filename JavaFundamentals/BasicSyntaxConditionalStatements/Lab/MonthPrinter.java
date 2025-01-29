package FundamentalsModule.BasicSyntaxConditionalStatements.Lab;

import java.util.Scanner;
public class MonthPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int input = Integer.parseInt(scanner.nextLine());
        if (input == 1) {System.out.println("January");}
        if (input == 2) {System.out.println("February");}
        if (input == 3) {System.out.println("March");}
        if (input == 4) {System.out.println("April");}
        if (input == 5) {System.out.println("May");}
        if (input == 6) {System.out.println("June");}
        if (input == 7) {System.out.println("July");}
        if (input == 8) {System.out.println("August");}
        if (input == 9) {System.out.println("September");}
        if (input == 10) {System.out.println("October");}
        if (input == 11) {System.out.println("November");}
        if (input == 12) {System.out.println("December");}
        if(input>12 || input<1){System.out.println("Error!");}

    }
}