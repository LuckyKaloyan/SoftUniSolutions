package FundamentalsModule.TextProcessing.Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class CeaserCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        List<String> list = new ArrayList<>();
        for(int i=0; i<line.length(); i++){

            list.add(String.valueOf((char)((int)line.charAt(i)+3)));

        }

        for(int i=0; i<line.length(); i++){
            System.out.print(list.get(i));
        }





    }
}
