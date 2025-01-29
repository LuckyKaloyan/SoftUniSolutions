package FundamentalsModule.BasicSyntaxConditionalStatements.Lab;

import java.util.Scanner;
public class MultiPlication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = Integer.parseInt(scanner.nextLine());
        for(int i=1; i<=10; i++){
            System.out.println(k+" X "+i+" = "+k*i);
        }
    }
}
