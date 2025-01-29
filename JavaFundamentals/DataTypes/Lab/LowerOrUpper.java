package FundamentalsModule.DataTypes.Lab;

import java.util.Scanner;
public class LowerOrUpper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        if(Character.isLowerCase(input.charAt(0))){
            System.out.println("lower-case");
        }else {
            System.out.println("upper-case");
        }

    }
}
