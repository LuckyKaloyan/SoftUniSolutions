package FundamentalsModule.BasicSyntaxConditionalStatements.Exercise;

import java.util.Scanner;
public class PrintAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = Integer.parseInt(scanner.nextLine());
        int p = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for(int k=i; k<=p; k++){
            System.out.print(k+" ");
            sum=sum+k;
        }
        System.out.println();
        System.out.println("Sum: "+sum);


    }
}
