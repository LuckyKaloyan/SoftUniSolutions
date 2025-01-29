package EntryModule.BonusExcercises.ForLoopMoreExcercises;

import java.util.Scanner;
public class Hospital {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int patientsbydays;
        int doctors = 7;
        int checked = 0;
        int unchecked = 0;




        for(int i = 1; i<=days; i++){
            if(i%3==0){if(unchecked>checked){doctors++;}}
            patientsbydays=Integer.parseInt((scanner.nextLine()));

            if(patientsbydays-doctors>0){
                checked=checked+doctors;
                unchecked=unchecked+(patientsbydays-doctors);
            }else{checked=checked+patientsbydays;}


        }

        System.out.printf("Treated patients: %d.%n", checked);
        System.out.printf("Untreated patients: %d.%n", unchecked);
    }
}
