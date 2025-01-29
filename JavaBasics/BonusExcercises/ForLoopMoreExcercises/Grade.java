package EntryModule.BonusExcercises.ForLoopMoreExcercises;

import java.util.Scanner;
public class Grade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double input = Double.parseDouble(scanner.nextLine());


        if(input>=2.00 && input<=2.99){System.out.println("Fail");}
        if(input>=3.00 && input<=3.49){System.out.println("Poor");}
        if(input>=3.50 && input<=4.49){System.out.println("Good");}
        if(input>=4.50 && input<=5.49){System.out.println("Very good");}
        if(input>=5.50 && input<=6.00){System.out.println("Excellent");}


    }
}
