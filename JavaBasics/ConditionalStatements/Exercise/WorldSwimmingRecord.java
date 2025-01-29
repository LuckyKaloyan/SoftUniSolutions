package EntryModule.ConditionalStatements.Exercise;

import java.util.Scanner;
public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double record = Double.parseDouble(scanner.nextLine());
        double length = Double.parseDouble(scanner.nextLine());
        double time = Double.parseDouble(scanner.nextLine());
        int shitnq = (int)length;

        int timesslowed = shitnq/15;
        double totalslow = timesslowed*12.5;


        double result = (length*time)+totalslow;

        if(result>=record){
            System.out.printf("No, he failed! He was %.2f seconds slower.", (result-record));
        }else {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", result);
        }
    }
}
