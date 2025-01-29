package FundamentalsModule.BasicSyntaxConditionalStatements.Lab;

import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int lk = Integer.parseInt(scanner.nextLine());
            lk=Math.abs(lk);
            if (lk % 2 == 1) {
                System.out.println("Please write an even number.");
            } else {

                System.out.println("The number is: " + lk);
                break;
            }
        }
    }
}
