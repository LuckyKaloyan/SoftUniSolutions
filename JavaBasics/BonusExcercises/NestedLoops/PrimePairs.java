package EntryModule.BonusExcercises.NestedLoops;

import java.util.Scanner;
public class PrimePairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputfirsttwo = Integer.parseInt(scanner.nextLine());
        int inputsecondtwo = Integer.parseInt(scanner.nextLine());
        int uptofirst = Integer.parseInt(scanner.nextLine());
        int uptosecond = Integer.parseInt(scanner.nextLine());


        for(int i=inputfirsttwo; i<=inputfirsttwo+uptofirst; i++){

            for(int j=inputsecondtwo; j<=inputsecondtwo+uptosecond; j++){

                if(i%2!=0 && i%3!=0 && i%5!=0 && i%7!=0 && j%2!=0 && j%3!=0 && j%5!=0 && j%7!=0){
                    System.out.println(i+""+j);

                }

            }
        }

    }
}
