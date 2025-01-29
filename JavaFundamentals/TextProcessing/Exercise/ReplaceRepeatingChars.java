package FundamentalsModule.TextProcessing.Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();

        List<String> list = new ArrayList<>();

        for(int i=0; i<word.length(); i++){
            list.add(String.valueOf(word.charAt(i)));
        }

        for(int i=0; i<word.length()-1; i++){
            try{  if(list.get(i).equals(list.get(i+1))){

                list.remove(i);
                i--;
            }}catch(Exception e){}
        }

        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i));
        }

    }
}
