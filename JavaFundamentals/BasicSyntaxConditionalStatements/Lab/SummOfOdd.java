package FundamentalsModule.BasicSyntaxConditionalStatements.Lab;

import java.util.Scanner;
public class SummOfOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int input = Integer.parseInt(scanner.nextLine());
        for(int i=1; i<=input; i++){
            sum = sum+(i*2-1);
            System.out.println((i*2-1));}
        System.out.println("Sum: "+sum);}

}
