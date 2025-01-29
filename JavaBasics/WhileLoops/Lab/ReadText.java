package EntryModule.WhileLoops.Lab;

import java.util.Scanner;
public class ReadText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String print = scanner.nextLine();
        if(!print.equals("Stop")){
            System.out.println(print);
        }
        while(!print.equals("Stop")){
            print = scanner.nextLine();
            if(print.equals("Stop")){break;}
            System.out.println(print);

        }
    }
}
