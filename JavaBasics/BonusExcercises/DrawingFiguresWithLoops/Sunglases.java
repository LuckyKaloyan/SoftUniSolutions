package EntryModule.BonusExcercises.DrawingFiguresWithLoops;

import java.util.Scanner;
public class Sunglases {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());

        for(int i=0; i<input; i++){

            for(int k=0; k<input*2; k++){

                if(i==0 || i==input-1 || k==0 || k==input*2-1){System.out.print("*");}
                else{
                    System.out.print("/");}

                if(input%2==1){
                    if(k==input*2-1 && input/2==i){{for (int l =0; l<input; l++){
                        System.out.print("|");
                    }}}
                    else if(k==input*2-1){for (int l =0; l<input; l++){
                        System.out.print(" ");
                    }}
                }else{if(k==input*2-1 && input/2-1==i){{for (int l =0; l<input; l++){
                    System.out.print("|");
                }}}
                else if(k==input*2-1){for (int l =0; l<input; l++){
                    System.out.print(" ");
                }}}
            }

            for(int k=0; k<input*2; k++){

                if(i==0 || i==input-1 || k==0 || k==input*2-1){System.out.print("*");}
                else{
                    System.out.print("/");}
            }
            System.out.println();
        }

    }
}
