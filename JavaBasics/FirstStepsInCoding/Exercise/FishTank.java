package EntryModule.FirstStepsInCoding.Exercise;

import java.util.Scanner;
public class FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());

        int volume = length*width*height;

        double percent = Double.parseDouble(scanner.nextLine());

        double result = (volume*(100-percent))/100;
        System.out.println(result/1000);


    }
}
