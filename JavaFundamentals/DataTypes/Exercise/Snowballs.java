package FundamentalsModule.DataTypes.Exercise;

import java.util.Scanner;

public class Snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int times = Integer.parseInt(scanner.nextLine());
        int snowball = Integer.parseInt(scanner.nextLine());
        int snowballTime = Integer.parseInt(scanner.nextLine());
        int snowballQuality = Integer.parseInt(scanner.nextLine());
        int bestcalc = 1;
        int currentcalc = 1;
        int top1 = snowball;
        int top2 = snowballTime;
        int top3 = snowballQuality;


        for(int j=0; j<snowballQuality; j++){
            bestcalc = bestcalc*(snowball/snowballTime);
        }
        for(int i=0; i<times-1;i++){
            snowball=Integer.parseInt(scanner.nextLine());
            snowballTime = Integer.parseInt(scanner.nextLine());
            snowballQuality = Integer.parseInt(scanner.nextLine());

            for(int j=0; j<snowballQuality; j++){
                currentcalc = currentcalc*(snowball/snowballTime);
            }
            if(currentcalc>bestcalc){
                bestcalc=currentcalc;
                top1=snowball;
                top2=snowballTime;
                top3=snowballQuality;
            }
            currentcalc=1;
        }
        System.out.printf("%d : %d = %d (%d)", top1, top2, bestcalc, top3);





    }
}
