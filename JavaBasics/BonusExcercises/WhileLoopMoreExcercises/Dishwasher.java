package EntryModule.BonusExcercises.WhileLoopMoreExcercises;

import java.util.Scanner;
public class Dishwasher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int detergent = Integer.parseInt(scanner.nextLine());
        int mldetergent = detergent*750;
        int number;
        int times = 0;
        int dishes = 0;
        int pots = 0;

        while(mldetergent>=0){
            times++;
            String input = scanner.nextLine();
            if(input.equals("End")){break;}
            number=Integer.parseInt(input);
            if(times%3==0){mldetergent=mldetergent-(number*15);
                pots=pots+number;}
            else{mldetergent=mldetergent-(number*5);
                dishes=dishes+number;}
        }
        if(mldetergent>=0){
            System.out.println("Detergent was enough!");
            System.out.printf("%d dishes and %d pots were washed.%n", dishes, pots);
            System.out.printf("Leftover detergent %d ml.", mldetergent);
        }else{
            System.out.printf("Not enough detergent, %d ml. more necessary!", Math.abs(mldetergent));
        }
    }
}
