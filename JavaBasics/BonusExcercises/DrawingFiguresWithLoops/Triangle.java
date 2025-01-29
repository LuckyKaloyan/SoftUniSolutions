package EntryModule.BonusExcercises.DrawingFiguresWithLoops;

import java.util.Scanner;
public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());

        for(int i =1; i<=input; i++){
            for(int k=1; k<=i; k++){
                System.out.print("$ ");
            }
            System.out.println();
        }



    }
}
