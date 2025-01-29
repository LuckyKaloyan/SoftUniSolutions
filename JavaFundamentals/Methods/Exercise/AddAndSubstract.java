package FundamentalsModule.Methods.Exercise;

import java.util.Scanner;
public class AddAndSubstract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        addAndSubstract(Integer.parseInt(scanner.nextLine()),Integer.parseInt(scanner.nextLine()),Integer.parseInt(scanner.nextLine()));


    }
    public static void addAndSubstract(int a, int b, int c){
        System.out.println(a+b-c);
    }
}
