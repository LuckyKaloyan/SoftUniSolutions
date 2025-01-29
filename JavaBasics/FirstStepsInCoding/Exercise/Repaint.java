package EntryModule.FirstStepsInCoding.Exercise;

import java.util.Scanner;
public class Repaint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nailon = Integer.parseInt(scanner.nextLine());
        double boq = Integer.parseInt(scanner.nextLine());
        int razreditel = Integer.parseInt(scanner.nextLine());
        int chasove = Integer.parseInt(scanner.nextLine());
        nailon=nailon+2;
        boq=boq+boq*0.1;


        double plainvalue = nailon*1.50+boq*14.50+razreditel*5;
        double realvalue = plainvalue+0.40;
        double payperhour = realvalue*0.3;
        double totalsum = realvalue+(payperhour*chasove);

        System.out.println(totalsum);


    }
}
