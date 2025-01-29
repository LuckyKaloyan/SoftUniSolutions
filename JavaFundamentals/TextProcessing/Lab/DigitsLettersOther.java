package FundamentalsModule.TextProcessing.Lab;

import java.util.Scanner;


public class DigitsLettersOther {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();



        for(int i=0; i<line.length(); i++){
            if(Character.isDigit(line.charAt(i))){
                System.out.print(line.charAt(i));
            }
        }
        System.out.println();
        for(int i=0; i<line.length(); i++){
            if(Character.isLetter(line.charAt(i))){
                System.out.print(line.charAt(i));
            }
        }

        System.out.println();
        for(int i=0; i<line.length(); i++){
            if(!Character.isDigit(line.charAt(i)) && !Character.isLetter(line.charAt(i))){
                System.out.print(line.charAt(i));
            }
        }
    }
}
