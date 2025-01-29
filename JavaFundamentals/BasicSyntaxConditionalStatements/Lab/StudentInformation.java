package FundamentalsModule.BasicSyntaxConditionalStatements.Lab;

import java.util.Scanner;
public class StudentInformation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Name: %s, Age: %d, JavaMoreBasics.ForLoopMoreExcercises.Grade: %.2f", scanner.nextLine(),
                Integer.parseInt(scanner.nextLine()), Double.parseDouble(scanner.nextLine()));
    }
}
