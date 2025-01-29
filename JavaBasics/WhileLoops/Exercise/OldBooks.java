package EntryModule.WhileLoops.Exercise;

import java.util.Scanner;
public class OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String favourite = scanner.nextLine();
        String firsttry = scanner.nextLine();
        int times = 0;
        if(favourite.equals(firsttry)){
            System.out.println("You checked 0 books and found it.");
        }

        while(!favourite.equals(firsttry)){
            firsttry = scanner.nextLine();
            times++;
            if(firsttry.equals("No More Books")){
                System.out.println("The book you search is not here!");
                System.out.println("You checked "+times+" books.");
                break;
            }
            if(firsttry.equals(favourite)){
                System.out.println("You checked "+times+" books and found it.");
                break;
            }
        }
    }
}
