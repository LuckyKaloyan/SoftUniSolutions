package FundamentalsModule.ObjectsAndClasses.Lab;

import java.util.Random;
import java.util.Scanner;

public class RandomizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split(" ");

        Random rnd = new Random();

        for (int i = words.length-1; i > 0; i--) {
            int j = rnd.nextInt(i+1);
            suap(words, i, j);
        }

        for (String word : words) {
            System.out.println(word);
        }

    }
    public static void suap(String[] a, int b, int c){
        String temporary;
        temporary=a[b];
        a[b]=a[c];
        a[c]=temporary;
    }
}
