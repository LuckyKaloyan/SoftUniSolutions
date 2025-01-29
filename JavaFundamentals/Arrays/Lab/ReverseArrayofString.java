package FundamentalsModule.Arrays.Lab;

import java.util.Scanner;
public class ReverseArrayofString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] tokens = scanner.nextLine().split(" ");

        for(int i=tokens.length-1; i>=0; i--){
            System.out.print(tokens[i]);
            System.out.print(" ");
        }






    }
}
