package EntryModule.ForLoops.Exercise;

import java.util.Scanner;
public class Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        double academypts = Double.parseDouble(scanner.nextLine());
        int number  = Integer.parseInt(scanner.nextLine());



        for(int i=0; i<number; i++){
            String nametime = scanner.nextLine();
            double pts = Double.parseDouble(scanner.nextLine());
            double points=pts*nametime.length();
            academypts=academypts+(points/2);
            if(academypts>=1250.5){
                System.out.printf("Congratulations, %s got a nominee for leading role with %01.1f!", name, academypts);
                break;
            }
        }
        if(academypts<1250.5){
            System.out.printf("Sorry, %s you need %01.1f more!", name, (1250.5-academypts));
        }




    }
}