package FundamentalsModule.Arrays.Lab;

import java.util.Scanner;
public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int day = Integer.parseInt(scanner.nextLine());

        String[] kofa = new String[8];
        kofa[1]="Monday";
        kofa[2]="Tuesday";
        kofa[3]="Wednesday";
        kofa[4]="Thursday";kofa[6]="Saturday";
        kofa[5]="Friday";kofa[7]="Sunday";

        if(day>=1 && 7>=day){
            System.out.println(kofa[day]);
        }else{
            System.out.println("Invalid day!");
        }


    }
}
