package EntryModule.BonusExcercises.ForLoopMoreExcercises;

import java.util.Scanner;
public class OddEvenPositions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double OddMin= 70000000;
        double OddMax=-70000000;
        double OddSum = 0;
        double EvenMin= 70000000;
        double EvenMax=-70000000;
        double EvenSum= 0;
        double number;

        int ko = Integer.parseInt(scanner.nextLine());
        for (int k = 1; k<=ko; k++){
            number = Double.parseDouble(scanner.nextLine());
            if(k%2==0){
                EvenSum=EvenSum+number;
                if(number>EvenMax){EvenMax=number;}
                if(number<EvenMin){EvenMin=number;}
            }
            else{OddSum=OddSum+number;
                if(number>OddMax){OddMax=number;}
                if(number<OddMin){OddMin=number;}
            }
        }

        System.out.printf("OddSum=%2.2f,%n", OddSum);
        if(OddMin==70000000){System.out.println("OddMin=No,");}else System.out.printf("OddMin=%2.2f,%n", OddMin);
        if(OddMax==-70000000){System.out.println("OddMax=No,");}else System.out.printf("OddMax=%2.2f,%n", OddMax);
        System.out.printf("EvenSum=%2.2f,%n", EvenSum);
        if(EvenMin==70000000){System.out.println("EvenMin=No,");} else System.out.printf("EvenMin=%2.2f,%n", EvenMin);
        if(EvenMax==-70000000){System.out.println("EvenMax=No");} else System.out.printf("EvenMax=%2.2f%n", EvenMax);

    }
}
