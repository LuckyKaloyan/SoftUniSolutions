package FundamentalsModule.Methods.Exercise;

import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        vowels(scanner.nextLine());
    }
    public static void vowels(String word){
        int sum = 0;
        for(int i=0; i<word.length(); i++){
            switch(String.valueOf(word.charAt(i))){
                case "a" :
                case "A":
                case "e":
                case "E":
                case "o":
                case "O":
                case "u":
                case "U":
                case "i":
                case "I":
                    sum++;
            }
        }
        System.out.println(sum);
    }
}
