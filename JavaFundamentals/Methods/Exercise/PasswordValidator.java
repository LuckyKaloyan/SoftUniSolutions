package FundamentalsModule.Methods.Exercise;

import java.util.Scanner;
public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        words(scanner.nextLine());

    }
    public static void words(String word){
        int digits =0;
        int failed = 0;
        for(int i=0; i<word.length(); i++){

            switch(String.valueOf(word.charAt(i))){

                case "a":case "A":case "b":case "B":
                case "c":case "D":case "e":case "E":
                case "f":case "F":case "g":case "G":
                case "h":case "H":case "i":case "I":
                case "j":case "J":case "k":case "K":
                case "l":case "L":case "m":case "M":
                case "n":case "N":case "o":case "O":
                case "p":case "P":case "q":case "Q":
                case "r":case "R":case "s":case "S":
                case "t":case "T":case "u":case "U":
                case "v":case "V":case "w":case "W":
                case "x":case "X":case "y":case "Y":
                case "z":case "Z":  break;

                case "1":case "2":
                case "3":case "4":case "5":case "6":
                case "7":case "8":case "9":case "0":
                    digits++;break;
                default: failed++;
            }

        }
        if((word.length()<6 || word.length()>10) || failed>0 || digits<2){
            if(word.length()<6 || word.length()>10){
                System.out.println("Password must be between 6 and 10 characters");
            }
            if(failed>0){
                System.out.println("Password must consist only of letters and digits");
            }
            if(digits<2){
                System.out.println("Password must have at least 2 digits");
            }
        }else {
            System.out.println("Password is valid");
        }



    }
}
