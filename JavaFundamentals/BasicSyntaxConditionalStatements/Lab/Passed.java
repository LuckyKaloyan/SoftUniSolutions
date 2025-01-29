package FundamentalsModule.BasicSyntaxConditionalStatements.Lab;
import java.util.Scanner;
public class Passed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);




        double grade = Double.parseDouble(scanner.nextLine());
        if(grade>=3.00){
            System.out.println("JavaFundamentals.BasicSyntax.BasicSyntaxConditionalStatementsLab.Passed!");

        }else {
            System.out.println("Failed!");
        }

    }
}

