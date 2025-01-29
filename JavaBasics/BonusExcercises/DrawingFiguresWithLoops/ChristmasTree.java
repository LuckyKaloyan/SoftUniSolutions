package EntryModule.BonusExcercises.DrawingFiguresWithLoops;

import java.util.Scanner;
public class ChristmasTree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());

        for(int i=-1; i<=input; i++){
            if(i==input){ System.out.print("|");}
            else{
                System.out.print(" ");
            }}

        System.out.println();

        for(int i=1; i<=input; i++){
            for(int l=input; l>i; l--){
                System.out.print(" ");}
            for(int k =0; k<=i*2; k++){
                if(k==i){System.out.print(" | ");}else System.out.print("*");}
            System.out.println();

        }
        for(int o=1; o<=input/2+1; o++){
            for(int p=0; p<input; p++){
                System.out.print(" ");
            }
            for(int u=1; u<=3; u++){
                System.out.print("|");
            }

            System.out.println();
        }
    }
}
