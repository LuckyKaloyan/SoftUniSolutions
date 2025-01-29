package FundamentalsModule.Methods.Lab;

import java.util.Scanner;
public class RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        method(scanner.nextLine(), Integer.parseInt(scanner.nextLine()), "");   }
    public static void method(String word, int number, String lastword) {

        for(int i=0; i<number; i++){
            lastword=lastword+word;
        }
        System.out.println(lastword);
    }
}
