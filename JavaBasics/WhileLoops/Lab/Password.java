package EntryModule.WhileLoops.Lab;

import java.util.Scanner;
public class Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        String password = scanner.nextLine();

        String triy = scanner.nextLine();
        if(triy.equals(password)){
            System.out.printf("Welcome %s", name);System.out.print("!");
        }

        while(!triy.equals(password)){
            triy = scanner.nextLine();
            if(triy.equals(password)){
                System.out.printf("Welcome %s", name); System.out.print("!");

            }
        }




    }
}
