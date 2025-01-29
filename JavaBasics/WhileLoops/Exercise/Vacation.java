package EntryModule.WhileLoops.Exercise;

import java.util.Scanner;
public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double needed = Double.parseDouble(scanner.nextLine());
        double having = Double.parseDouble(scanner.nextLine());
        int inarow = 0;
        int days = 0;

        while(needed>having){
            days++;
            String move = scanner.nextLine();
            double sum = Double.parseDouble(scanner.nextLine());
            if(move.equals("spend")){sum=sum*(-1);}
            if(move.equals("spend")){inarow++;}else{inarow=0;}
            if(inarow==5){
                System.out.println("You can't save the money.");
                System.out.println(days);break;
            }
            having = having+sum;
            if(having<0){having=0;}
            if(having>=needed){
                System.out.println("You saved the money for "+days+" days.");
                break;}
        }


    }
}
