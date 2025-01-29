package EntryModule.WhileLoops.Lab;

import java.util.Scanner;
public class MinNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxnumber = Integer.MAX_VALUE;
        String stop = "start";

        while(stop.equals("start")){
            String input = scanner.nextLine();
            if(input.equals("Stop")){break;}
            int num = Integer.parseInt(input);
            if(num<maxnumber){maxnumber=num;}
        }
        System.out.println(maxnumber);




    }
}
