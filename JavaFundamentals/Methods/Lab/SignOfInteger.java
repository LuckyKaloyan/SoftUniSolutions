package FundamentalsModule.Methods.Lab;

import java.util.Scanner;
public class SignOfInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        number(Integer.parseInt(scanner.nextLine()));
    }
    public static void number(int a){
        if(a>0){
            System.out.printf("The number %d is positive.", a);
        }else if(a<0){ System.out.printf("The number %d is negative.", a);}
        else{
            System.out.println("The number 0 is zero.");
        }

    }
}
