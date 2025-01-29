package EntryModule.AdvancedConditionalStatements.Exercise;

import java.util.Scanner;
public class Operations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        double x;
        double y;


        if (operator.equals("+")) {
            if((n1+n2)%2==0){System.out.println(n1 + " " + operator + " " + n2 + " = " + (n1 + n2) + " - even");}
            else{System.out.println(n1 + " " + operator + " " + n2 + " = " + (n1 + n2) + " - odd");}

        }
        if (operator.equals("-")) {
            if((n1-n2)%2==0){System.out.println(n1 + " " + operator + " " + n2 + " = " + (n1-n2) + " - even");}
            else{System.out.println(n1 + " " + operator + " " + n2 + " = " + (n1 - n2) + " - odd");}

        }
        if (operator.equals("*")) {
            if((n1*n2)%2==0){System.out.println(n1 + " " + operator + " " + n2 + " = " + (n1*n2) + " - even");}
            else{System.out.println(n1 + " " + operator + " " + n2 + " = " + (n1*n2) + " - odd");}

        }

        if (operator.equals("/")) {
            x = (double) n1;
            y = (double) n2;
            if (y == 0) {
                System.out.println("Cannot divide " + n1 + " by zero");
            } else{System.out.printf(n1 + " " + operator + " " + n2 + " = " + "%.2f", (x / y));}

        }
        if(operator.equals("%")){

            if (n2 == 0) {
                System.out.println("Cannot divide " + n1 + " by zero");
            } else{System.out.println(n1 + " " + operator + " " + n2 + " = " + (n1%n2));}


        }
    }}
