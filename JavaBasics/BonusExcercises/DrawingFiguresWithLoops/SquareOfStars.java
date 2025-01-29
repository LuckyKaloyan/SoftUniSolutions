package EntryModule.BonusExcercises.DrawingFiguresWithLoops;

import java.util.Scanner;

public class SquareOfStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());

        for(int i=0; i<a; i++){
            for(int j=0; j<a; j++){
                System.out.print("* ");
            } System.out.println();

        }

    }
}
