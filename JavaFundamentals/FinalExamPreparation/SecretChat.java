package FundamentalsModule.FinalExamPreparation;

import java.util.Scanner;

public class SecretChat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (true) {
            String word = scanner.nextLine();
            if (word.equals("Reveal")) {
                break;
            }

            String[] splitted = word.split(":\\|:");

            if (splitted[0].equals("InsertSpace")) {
                int index = Integer.parseInt(splitted[1]);
                input = input.substring(0, index) + " " + input.substring(index);
                System.out.println(input);
            }

            if (splitted[0].equals("Reverse")) {
                String substring = splitted[1];
                if (input.contains(substring)) {
                    StringBuilder reversed = new StringBuilder(substring).reverse();
                    input = input.replaceFirst(substring, reversed.toString());
                    System.out.println(input);
                } else {
                    System.out.println("error");
                }
            }

            if (splitted[0].equals("ChangeAll")) {
                String substring = splitted[1];
                String replacement = splitted[2];
                input = input.replace(substring, replacement);
                System.out.println(input);
            }
        }

        System.out.println("You have a new text message: " + input);
    }
}
