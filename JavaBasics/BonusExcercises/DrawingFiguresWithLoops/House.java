package EntryModule.BonusExcercises.DrawingFiguresWithLoops;

import java.util.Scanner;
public class House {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());

        if (input == 2) {
            System.out.println("**");
            System.out.println("||");
        } else if (input == 1) {
            System.out.println("*");
        }else for (int i = 0; i < input; i++) {
            for (int k = input; k > 0; k--) {
                if (i >= input / 2) {
                    if ((i+2 >= k+1 && input-i>=k+1) || i+2 <= k) {
                        System.out.print("-");
                    } else {
                        System.out.print("*");
                    }
                }
            }
            if(i>=input/2){System.out.println();}

        }
        for(int i=0; i<input/2; i++){
            for(int k=0; k<input; k++){
                if(k==0 || k==input-1){
                    System.out.print("|");
                }else System.out.print("*");
            }
            System.out.println();
        }
    }
}
