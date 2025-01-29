package EntryModule.WhileLoops.Exercise;

import java.util.Scanner;
public class Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double input = Double.parseDouble(scanner.nextLine());
        double input2 = input*100;
        int stinki = (int)input2;
        int times = 0;

        while (stinki >= 200) {
            stinki = stinki - 200;
            times++;
        }
        while(stinki>=100){
            stinki=stinki-100;
            times++;
        }
        while(stinki>=50){
            stinki=stinki-50;
            times++;
        }
        while(stinki>=20){
            stinki=stinki-20;
            times++;
        }
        while(stinki>=10){
            stinki=stinki-10;
            times++;
        }
        while(stinki>=5){
            stinki=stinki-5;
            times++;
        }
        while(stinki>=2){
            stinki=stinki-2;
            times++;
        }
        while(stinki>0){
            times++;
            stinki=0;
        }
        System.out.println(times);
    }
}
