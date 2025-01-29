package EntryModule.WhileLoops.Lab;

import java.util.Scanner;
public class Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());
        int number = Integer.parseInt(scanner.nextLine());
        if(number>=input){
            System.out.println(number);
        }
        while(number<input){
            int next = Integer.parseInt(scanner.nextLine());
            number = number + next;
            if(number>=input){
                System.out.println(number);
            }
        }

    }
}
