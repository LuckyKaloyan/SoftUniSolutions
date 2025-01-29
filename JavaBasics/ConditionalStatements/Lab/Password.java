package EntryModule.ConditionalStatements.Lab;

import java.util.Scanner;
public class Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String kiufte = "s3cr3t!P@ssw0rd";
        String banica = scanner.nextLine();

        if(banica.equals(kiufte)){
            System.out.println("Welcome");
        }else{
            System.out.println("Wrong password!");
        }

    }
}
