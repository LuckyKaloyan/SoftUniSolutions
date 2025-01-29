package EntryModule.AdvancedConditionalStatements.Exercise;

import java.util.Scanner;
public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String month = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());

        switch(month){
            case "May":
            case "October":
                if(nights<=7){
                    System.out.printf("Apartment: %.2f lv.", 65.00*nights);
                    System.out.println();
                    System.out.printf("Studio: %.2f lv.", 50.00*nights);
                }else if(nights<=14){
                    System.out.printf("Apartment: %.2f lv.", 65.00*nights);
                    System.out.println();
                    System.out.printf("Studio: %.2f lv.", 50.00*nights*0.95);
                }else {
                    System.out.printf("Apartment: %.2f lv.", 65.00*nights*0.90);
                    System.out.println();
                    System.out.printf("Studio: %.2f lv.", 50.00*nights*0.70);

                }break;
            case "June":
            case "September":
                if(nights<=7){
                    System.out.printf("Apartment: %.2f lv.", 68.70*nights);
                    System.out.println();
                    System.out.printf("Studio: %.2f lv.", 75.20*nights);
                }else if(nights<=14){
                    System.out.printf("Apartment: %.2f lv.", 68.70*nights);
                    System.out.println();
                    System.out.printf("Studio: %.2f lv.", 75.20*nights);
                }else {
                    System.out.printf("Apartment: %.2f lv.", 68.70*nights*0.90);
                    System.out.println();
                    System.out.printf("Studio: %.2f lv.", 75.20*nights*0.80);

                }break;
            case "July":
            case "August":
                if(nights<7){
                    System.out.printf("Apartment: %.2f lv.", 77.00*nights);
                    System.out.println();
                    System.out.printf("Studio: %.2f lv.", 76.00*nights);
                }else if(nights<=14){
                    System.out.printf("Apartment: %.2f lv.", 77.00*nights);
                    System.out.println();
                    System.out.printf("Studio: %.2f lv.", 76.00*nights);
                }else {
                    System.out.printf("Apartment: %.2f lv.", 77*nights*0.90);
                    System.out.println();
                    System.out.printf("Studio: %.2f lv.", 76.00*nights);
                }break;

        }
    }
}
