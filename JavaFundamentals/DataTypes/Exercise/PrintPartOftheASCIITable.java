package FundamentalsModule.DataTypes.Exercise;


import java.util.Scanner;

import static java.lang.Character.toChars;

public class PrintPartOftheASCIITable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());
        int input2 = Integer.parseInt(scanner.nextLine());

        for(int i=input; i<=input2; i++){
            System.out.print(toChars(i));
            System.out.print(" ");
        }

    }
}