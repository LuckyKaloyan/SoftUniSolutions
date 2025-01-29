package FundamentalsModule.BasicSyntaxConditionalStatements.Lab;

import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int beginning = Integer.parseInt(scanner.nextLine());
        int number = Integer.parseInt(scanner.nextLine());

        if(number>10){
            System.out.println(beginning+" X "+ number+" = "+number*beginning);
        }else{

            for(int i=number; i<=10; i++){
                System.out.println(beginning + " X "+i +" = "+beginning*i);
                if(number*i>100){break;}
            }}
    }
}
