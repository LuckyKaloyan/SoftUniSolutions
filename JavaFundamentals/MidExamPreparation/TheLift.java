package FundamentalsModule.MidExamPreparation;

import java.util.Arrays;
import java.util.Scanner;
public class TheLift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        int []lifts = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        boolean isempty = false;

        for(int i=0; i<lifts.length; i++){
            if(people>0 && lifts[i]<4){
                for(int j=0; j<4; j++){
                    if(people>0 && lifts[i]<4){
                        people--;
                        lifts[i]++;
                    }
                }
            }
        }

        for(int i=0; i<lifts.length; i++) {
            if(lifts[i]<4){
                isempty = true;
                break;
            }

        }
        if(people>0){
            System.out.printf("There isn't enough space! %d people in a queue!", people);
            System.out.println();
        }else if(isempty){
            System.out.println("The lift has empty spots!");
        }
        for(int i=0; i<lifts.length; i++){

            System.out.print(lifts[i]+" ");


        }





    }

}
