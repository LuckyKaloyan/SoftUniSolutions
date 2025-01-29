package FundamentalsModule.MidExamPreparation;

import java.util.Scanner;

public class BonusScorringSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double studentscount = Integer.parseInt(scanner.nextLine());
        double totallectures = Integer.parseInt(scanner.nextLine());
        double additionalbonus = Integer.parseInt(scanner.nextLine());

        double maxbonus = 0;
        double maxbonusattendance = 0;

        for(int i=0; i<studentscount; i++){

            double attendance = Integer.parseInt(scanner.nextLine());

            double totalbonus = (attendance/totallectures)*(5+additionalbonus);

            if(totalbonus>maxbonus){
                maxbonus=totalbonus;
                maxbonusattendance=attendance;
            }
        }
        System.out.printf("Max Bonus: %.0f.%n",maxbonus);
        System.out.printf("The student has attended %.0f lectures.",maxbonusattendance);


    }
}
