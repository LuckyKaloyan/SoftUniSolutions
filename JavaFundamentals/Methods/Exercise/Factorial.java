package FundamentalsModule.Methods.Exercise;

import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        factorialdivison(Integer.parseInt(scanner.nextLine()),Integer.parseInt(scanner.nextLine()));


    }
    public static void factorialdivison(int a, int b){
        double result1 = 1;
        double result2 = 1;
        for(int i=1; i<=a; i++){
            result1=result1*i;
        }
        for(int j=1; j<=b; j++){
            result2=result2*j;
        }
        System.out.printf("%2.2f", result1/result2);

    }
}
