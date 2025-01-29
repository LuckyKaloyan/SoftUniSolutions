package EntryModule.BonusExcercises.ForLoopMoreExcercises;

import java.util.Scanner;
public class BackInTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double money = Double.parseDouble(scanner.nextLine());
        int year = Integer.parseInt(scanner.nextLine());
        double currentcosts = 0;
        int years = 18;

        for(int i=1800; i<=year; i++){

            if(i%2==1){currentcosts=currentcosts+12000+(years*50);}
            else{currentcosts=currentcosts+12000;}
            years++;
        }

        if(currentcosts>money){
            System.out.printf("He will need %2.2f dollars to survive.", currentcosts-money);
        }else{
            System.out.printf("Yes! He will live a carefree life and will have %2.2f dollars left.", money-currentcosts);
        }
    }
}
