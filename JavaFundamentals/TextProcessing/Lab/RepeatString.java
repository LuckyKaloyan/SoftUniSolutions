package FundamentalsModule.TextProcessing.Lab;

import java.util.Scanner;
public class RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] array = scanner.nextLine().split(" ");

        for(int a=0; a<array.length; a++){

            for(int i=0; i<array[a].length(); i++){
                System.out.print(array[a]);
            }
        }
    }
}
