package EntryModule.BonusExcercises.DrawingFiguresWithLoops;

import java.util.Scanner;
public class SquareFrame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int square = Integer.parseInt(scanner.nextLine());

        for(int i =0; i<square; i++){

            for(int k=0; k<square; k++){
                if( k==square-1 && i!=0 && i!=square-1){System.out.print("| ");}
                else if(k==0 && i!=0 && i!=square-1){System.out.print("| ");
                }
                else if(k==0 || k==square-1){System.out.print("+ ");}
                else{
                    System.out.print("- ");
                }
            }
            System.out.println();
        }



    }
}
