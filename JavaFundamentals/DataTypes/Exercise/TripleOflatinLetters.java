package FundamentalsModule.DataTypes.Exercise;

import java.util.Scanner;
public class TripleOflatinLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());
        char firstChar;
        char secondChar;
        char thirdChar;


        for(int i=0; i<input; i++){
            for(int k=0; k<input; k++){
                for(int j=0; j<input; j++){
                    firstChar= (char) ('a'+i);
                    secondChar=(char)('a'+k);
                    thirdChar=(char)('a'+j);

                    System.out.printf("%c%c%c%n", firstChar, secondChar, thirdChar);

                }
            }
        }
    }
}