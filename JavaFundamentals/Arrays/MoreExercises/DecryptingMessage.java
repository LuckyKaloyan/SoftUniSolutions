package FundamentalsModule.Arrays.MoreExercises;

import java.util.Scanner;
public class DecryptingMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int key = Integer.parseInt(scanner.nextLine());
        int times = Integer.parseInt(scanner.nextLine());
        String word = "";
        char a;
        String letter;
        int aloda;

        for(int i=0; i<times; i++){
            letter = scanner.nextLine();
            a=letter.charAt(0);
            aloda=(int) a;
            a=(char)(aloda+key);
            System.out.print(a);
        }
        System.out.println(word);

    }
}
