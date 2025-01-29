package EntryModule.WhileLoops.Lab;

import java.util.Scanner;
public class Sequence2kplus1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
        int number = 1;if(input>=1){System.out.println(1);}
        while(input>number){
            number=(number*2)+1;

            if(number>input){
                break;}System.out.println(number);}
    }
}
