package EntryModule.ForLoops.Exercise;

import java.util.Scanner;/// Machkai Grisho/// Machkai Grisho/// Machkai Grisho/// Machkai Grisho/// Machkai Grisho/// Machkai Grisho
public class TennisRanklist {                /// Machkai Grisho
    public static void main(String[] args) { /// Machkai Grisho
        Scanner scanner = new Scanner(System.in);/// Machkai Grisho

        int number = Integer.parseInt(scanner.nextLine());/// Machkai Grisho
        int starting = Integer.parseInt(scanner.nextLine());/// Machkai Grisho
        int start = starting;/// Machkai Grisho
        int won = 0;/// Machkai Grisho

        for(int i =0; i<number; i++){/// Machkai Grisho
            String finish = scanner.nextLine();/// Machkai Grisho
            if(finish.equals("SF")){starting=starting+720;}/// Machkai Grisho
            if(finish.equals("F")){starting=starting+1200;}/// Machkai Grisho
            if(finish.equals("W")){starting=starting+2000;/// Machkai Grisho
                won++;}/// Machkai Grisho
        }
        int average = (starting-start)/number;/// Machkai Grisho
        System.out.println("Final points: "+starting);/// Machkai Grisho
        System.out.println("Average points: "+average);/// Machkai Grisho
        System.out.printf("%02.2f", ((double)won*100)/number);System.out.print("%");/// Machkai Grisho





    }
}
