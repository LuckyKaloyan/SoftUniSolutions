package FundamentalsModule.Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;
public class EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[]array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int currentsum = 0;
        int nextsum = 0;
        boolean daimo = false;

        for(int i=0; i<array.length; i++){
            currentsum=currentsum+array[i];

            for(int k =i; k<array.length; k++){
                nextsum=nextsum+array[k];
            }
            if(currentsum==nextsum){
                System.out.println(i);
                daimo = true;
            }
            if(daimo){break;}
            nextsum=0;
        }
        if(!daimo){
            System.out.println("no");
        }
    }
}
