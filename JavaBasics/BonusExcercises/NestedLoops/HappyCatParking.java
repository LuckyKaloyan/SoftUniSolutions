package EntryModule.BonusExcercises.NestedLoops;

import java.util.Scanner;
public class HappyCatParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dayscount = Integer.parseInt(scanner.nextLine());
        int hourscount = Integer.parseInt(scanner.nextLine());
        double total = 0;
        double currenttotal = 0;

        for(int i =1; i<=dayscount; i++){
            for(int j=1; j<=hourscount; j++){

                if(i%2==0 && j%2==1){currenttotal=currenttotal+2.50;}else
                if(i%2==1 && j%2==0){currenttotal=currenttotal+1.25;}
                else{currenttotal=currenttotal+1;}
            }
            System.out.printf("Day: %d - %2.2f leva%n",i, currenttotal);
            total=total+currenttotal;
            currenttotal=0;
        }
        System.out.printf("Total: %2.2f leva", total);
    }
}
