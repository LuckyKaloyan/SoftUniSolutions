package EntryModule.ConditionalStatements.Exercise;

import java.util.Scanner;
public class Bonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int NMN = Integer.parseInt(scanner.nextLine());
        double bonus;

        if(NMN<=100){
            bonus = 5;
            if(NMN%2==0){bonus++;}
            if(NMN%5==0 && NMN%10!=0){bonus=bonus+2;}
            System.out.println(bonus);
            System.out.println(bonus+NMN);
        }
        if(NMN>100 && NMN<=1000){
            bonus = NMN*0.2;
            if(NMN%2==0){bonus++;}
            if(NMN%5==0 && NMN%10!=0){bonus=bonus+2;}
            System.out.println(bonus);
            System.out.println(bonus+NMN);
        }
        if(NMN>1000){
            bonus = NMN*0.1;
            if(NMN%2==0){bonus++;}
            if(NMN%5==0 && NMN%10!=0){bonus=bonus+2;}
            System.out.println(bonus);
            System.out.println(bonus+NMN);
        }







    }
}
