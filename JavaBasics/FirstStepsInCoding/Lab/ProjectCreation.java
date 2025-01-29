package EntryModule.FirstStepsInCoding.Lab;

import java.util.Scanner;
public class ProjectCreation{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int number = Integer.parseInt(scanner.nextLine());


        System.out.println("The architect "+name+" will need "+(number*3)+" hours to complete "+number+" project/s.");





    }
}
