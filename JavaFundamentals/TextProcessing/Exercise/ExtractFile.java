package FundamentalsModule.TextProcessing.Exercise;

import java.util.Scanner;
public class ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] array = scanner.nextLine().split("\\\\");

        String[] word = array[array.length-1].split("\\.");

        System.out.printf("File name: %s", word[0]);
        System.out.println();
        System.out.printf("File extension: %s", word[1]);



    }
}
