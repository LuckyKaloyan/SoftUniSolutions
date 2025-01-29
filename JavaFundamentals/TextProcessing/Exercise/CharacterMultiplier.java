package FundamentalsModule.TextProcessing.Exercise;

import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] array = scanner.nextLine().split(" ");
        String str1 = array[0];
        String str2 = array[1];

        int minLength = Math.min(str1.length(), str2.length());
        int value = 0;

        for (int i = 0; i < minLength; i++) {
            value += (int) str1.charAt(i) * (int) str2.charAt(i);
        }

        for (int i = minLength; i < str1.length(); i++) {
            value += (int) str1.charAt(i);
        }

        for (int i = minLength; i < str2.length(); i++) {
            value += (int) str2.charAt(i);
        }

        System.out.println(value);
    }
}
