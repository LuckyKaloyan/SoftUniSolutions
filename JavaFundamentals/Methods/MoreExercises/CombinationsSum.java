package FundamentalsModule.Methods.MoreExercises;

import java.util.Scanner;

public class CombinationsSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int begining = Integer.parseInt(scanner.nextLine());
        int ending = Integer.parseInt(scanner.nextLine());
        int magic = Integer.parseInt(scanner.nextLine());
        int combinations = 0;
        boolean kiufte = true;



        for(int j=begining; j<=ending; j++){
            for(int i=begining; i<=ending; i++){
                combinations++;
                if(j+i==magic){
                    System.out.printf("Combination N:%d (%d + %d = %d)" ,combinations,j,i,magic);
                    kiufte=false;
                }
            }
            if(!kiufte){break;}
            if(j==ending){
                System.out.printf("%d combinations - neither equals %d", combinations, magic);
                break;
            }
        }
    }
}
