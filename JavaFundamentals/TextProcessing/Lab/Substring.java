package FundamentalsModule.TextProcessing.Lab;

import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        String string = scanner.nextLine();

        for(int i=0; i<string.length(); i++){
            string = string.replaceAll(word, "");
        }

        System.out.println(string);
    }
}
