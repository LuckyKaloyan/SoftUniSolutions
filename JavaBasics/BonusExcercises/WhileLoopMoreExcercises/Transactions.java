package EntryModule.BonusExcercises.WhileLoopMoreExcercises;

import java.util.Scanner;
public class Transactions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double target = Double.parseDouble(scanner.nextLine());
        double input;
        int times = 0;
        String blahblah;
        double acceptedCards = 0;
        double acceptedCash = 0;
        double totalcash = 0;
        double totalcards = 0;

        while(target>0){
            blahblah= scanner.nextLine();
            times++;
            if(blahblah.equals("End")){
                System.out.println("Failed to collect required money for charity.");
                break;}
            input = Double.parseDouble(blahblah);
            if(times%2==0){if(input<10){
                System.out.println("Error in transaction!");}
            else{target=target-input;
                totalcards=totalcards+input;
                acceptedCards++;
                System.out.println("Product sold!");}


            }else{if(input>100){
                System.out.println("Error in transaction!");
            }else{target=target-input;
                totalcash=totalcash+input;
                acceptedCash++;
                if(target<=0){break;}
                System.out.println("Product sold!");
            }}
        }
        if(target<=0){
            System.out.printf("Average CS: %2.2f%n",totalcash/acceptedCash);
            System.out.printf("Average CC: %2.2f" , totalcards/acceptedCards);

        }
    }
}
