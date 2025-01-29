package FundamentalsModule.DataTypes.Exercise;

import java.util.Scanner;
public class PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int power = Integer.parseInt(scanner.nextLine());
        int originalpower = power;
        int distance = Integer.parseInt(scanner.nextLine());
        int exhaustionFactor = Integer.parseInt(scanner.nextLine());
        int count = 0;


        while(power>=distance){

            power=power-distance;
            if(power<=0){break;}
            if(power*2==originalpower){
                try{power=power/exhaustionFactor;}catch (Exception e){}}
            count++;

        }
        System.out.println(Math.abs(distance-power));
        System.out.println(count);




    }
}
