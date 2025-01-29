package EntryModule.BonusExcercises.ForLoopMoreExcercises;

import java.util.Scanner;
public class Bills {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int times = Integer.parseInt(scanner.nextLine());
        double voda = 20;
        double internet = 15;
        double tok;
        double totaltok = 0;


        for(int i=0; i<times; i++){
            tok = Double.parseDouble(scanner.nextLine());
            totaltok=totaltok+tok;
        }
        System.out.print("Electricity: "); System.out.printf("%2.2f lv%n", totaltok);
        System.out.print("Water: "); System.out.printf("%2.2f lv%n", (voda*times));
        System.out.print("Internet: ");System.out.printf("%2.2f lv%n", (internet*times));
        System.out.print("Other: ");System.out.printf("%2.2f lv%n", (((voda+internet)*times+totaltok)*1.2));
        System.out.print("Average: ");System.out.printf("%2.2f lv%n", (((((voda+internet)*times+totaltok)*1.2)+((voda+internet)*times+totaltok))/times));



    }
}
