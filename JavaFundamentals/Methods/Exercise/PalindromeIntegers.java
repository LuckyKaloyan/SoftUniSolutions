package FundamentalsModule.Methods.Exercise;

import java.util.Scanner;

public class PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        palindrome(scanner);
        scanner.close();
    }
    public static void palindrome(Scanner scanner) {
        boolean trueorfalse = true;
        String a = scanner.nextLine();

        while (!a.equals("END")) {
            for (int i = 0; i < a.length() / 2; i++) {
                if (a.charAt(i) != a.charAt(a.length() - 1 - i)) {
                    trueorfalse = false;
                    break;
                }
            }
            if (trueorfalse) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
            trueorfalse = true;
            a = scanner.nextLine();
            if (a.equals("END")) {
                break;
            }
        }
    }
}
