package EntryModule.AdvancedConditionalStatements.Exercise;

import java.util.Scanner;
public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        double one = Integer.parseInt(scanner.nextLine());
        double two = Integer.parseInt(scanner.nextLine());
        double x = one*two;
        double z = 1;

        switch(word){
            case "Premiere": z=12;
                System.out.printf("%02.2f", x*z);
                break;
            case "Normal": z=7.50;
                System.out.printf("%02.2f", x*z);
                break;
            case "Discount": z=5.00;
                System.out.printf("%02.2f", x*z);
                break;
            default :
                System.out.println("error"); break;
        }








    }
}
