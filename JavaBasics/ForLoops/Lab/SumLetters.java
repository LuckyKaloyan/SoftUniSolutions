package EntryModule.ForLoops.Lab;

import java.util.Scanner;
public class SumLetters {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int value = 0;
        String word = scanner.nextLine();
        for(int i=0; i<word.length(); i++){
            if(word.charAt(i)=='a'){value=value+1;}
            if(word.charAt(i)=='e'){value=value+2;}
            if(word.charAt(i)=='i'){value=value+3;}
            if(word.charAt(i)=='o'){value=value+4;}
            if(word.charAt(i)=='u'){value=value+5;}
        }
        System.out.println(value);




    }
}
