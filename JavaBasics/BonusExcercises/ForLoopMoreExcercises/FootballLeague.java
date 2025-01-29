package EntryModule.BonusExcercises.ForLoopMoreExcercises;

import java.util.Scanner;
public class FootballLeague {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int capacity = Integer.parseInt(scanner.nextLine());
        double fans = Double.parseDouble(scanner.nextLine());
        String sector;

        double asector = 0;
        double bsector = 0;
        double vsector = 0;
        double gsector = 0;

        for(int i=0; i<fans; i++){
            sector = scanner.nextLine();
            if(sector.equals("A")){asector++;}
            if(sector.equals("B")){bsector++;}
            if(sector.equals("V")){vsector++;}
            if(sector.equals("G")){gsector++;}
        }

        System.out.printf("%2.2f",asector/fans*100); System.out.println("%");
        System.out.printf("%2.2f",bsector/fans*100); System.out.println("%");
        System.out.printf("%2.2f",vsector/fans*100); System.out.println("%");
        System.out.printf("%2.2f",gsector/fans*100); System.out.println("%");
        System.out.printf("%2.2f",fans/capacity*100);  System.out.print("%");

    }
}
