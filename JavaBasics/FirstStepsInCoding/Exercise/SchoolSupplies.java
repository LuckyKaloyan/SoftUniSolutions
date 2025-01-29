package EntryModule.FirstStepsInCoding.Exercise;

import java.util.Scanner;
public class SchoolSupplies {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pens = Integer.parseInt(scanner.nextLine());
        int markers = Integer.parseInt(scanner.nextLine());
        int windex = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        double result = (pens*5.80+markers*7.20+windex*1.20)*((100-percent)/100);
        System.out.println(result);

    }

}
