package EntryModule.BonusExcercises.WhileLoopMoreExcercises;

import java.util.Scanner;
public class AverageNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int j = Integer.parseInt(scanner.nextLine());
        int k = 0;
        double total = 0;
        int num;
        while(k<j){k++;
            num=Integer.parseInt(scanner.nextLine());
            total=total+num;
        }

        System.out.printf("%2.2f", total/j);

    }
}
