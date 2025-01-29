package EntryModule.BonusExcercises.DrawingFiguresWithLoops;

import java.util.Scanner;
public class Rombus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int input = Integer.parseInt(scanner.nextLine());

        for(int i =0; i<input; i++){
            for(int j=input-1; j>i; j--){
                System.out.print(" ");}

            for(int k =0; k<=i; k++){
                System.out.print("* ");}
            System.out.println();}

        for(int i =input-2; i>=0; i--){
            for(int j=input-1; j>i; j--){
                System.out.print(" ");}
            for(int k =0; k<=i; k++){
                System.out.print("* ");}
            System.out.println();
        }


    }
}
