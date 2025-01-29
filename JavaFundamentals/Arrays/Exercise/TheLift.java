package FundamentalsModule.Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class TheLift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int number = Integer.parseInt(scanner.nextLine());

        int[]arrei = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        boolean itisreal = true;
        boolean fullandready = false;

        for(int i=0; i<arrei.length; i++){
            if(arrei[i]<=4){
                if(number>=4){
                    number=number-(4-arrei[i]);
                    arrei[i]=4;}
                else{if(arrei[i]+number<=4){
                    arrei[i]=arrei[i]+number;
                    number=0;}}
            }
        }
        for(int i=0; i<arrei.length; i++){
            if(arrei[i]<4){itisreal=false;
                break;}
        }
        if(itisreal && number==0){
            for(int i=0; i<arrei.length; i++){
                System.out.print("4 ");
            }
        }else if(!itisreal){
            System.out.println("The lift has empty spots!");
            for(int i=0; i<arrei.length; i++){
                System.out.printf("%d ", arrei[i]);
            }
        }else {
            System.out.printf("There isn't enough space! %d people in a queue!", number);
            System.out.println();
            for(int i=0; i<arrei.length; i++)
            {
                System.out.print("4 ");
            }
        }
    }
}
