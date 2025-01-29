package EntryModule.BonusExcercises.ForLoopMoreExcercises;

import java.util.Scanner;
public class GameOfIntervals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int times = Integer.parseInt(scanner.nextLine());
        double number;
        double points = 0;
        double zerotonine= 0;
        double tentonineteen = 0;
        double twentytotwentynine = 0;
        double thirtytothirtynine = 0;
        double fortytofifty = 0;
        double invalidnumbers = 0;



        for(int i=0; i<times; i++){
            number = Integer.parseInt(scanner.nextLine());

            if(number>=0 && number<=9){zerotonine++;
                points=points+(number*0.2);}
            if(number>=10 && number<=19){tentonineteen++;
                points=points+(number*0.3);}
            if(number>=20 && number<=29){twentytotwentynine++;
                points=points+(number*0.4);}
            if(number>=30 && number<=39){thirtytothirtynine++;
                points=points+50;}
            if(number>=40 && number<=50){fortytofifty++;
                points=points+100;}
            if(number<0 || number>50){invalidnumbers++;
                points=points/2;}
        }
        System.out.printf("%2.2f", points);
        System.out.println();
        System.out.printf("From 0 to 9: %2.2f", (zerotonine/times)*100);System.out.println("%");
        System.out.printf("From 10 to 19: %2.2f", (tentonineteen/times)*100);System.out.println("%");
        System.out.printf("From 20 to 29: %2.2f", (twentytotwentynine/times)*100);System.out.println("%");
        System.out.printf("From 30 to 39: %2.2f", (thirtytothirtynine/times)*100);System.out.println("%");
        System.out.printf("From 40 to 50: %2.2f", (fortytofifty/times)*100);System.out.println("%");
        System.out.printf("Invalid numbers: %2.2f", (invalidnumbers/times)*100);System.out.println("%");


    }
}
