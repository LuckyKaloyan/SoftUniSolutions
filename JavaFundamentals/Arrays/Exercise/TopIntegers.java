package FundamentalsModule.Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;
public class TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        boolean bigger = true;


        for(int i=0; i<=numbers.length-1; i++){

            for(int k=i+1; k<=numbers.length-1; k++){

                if(numbers[k]>=numbers[i]){ bigger=false; break;}
            }
            if(bigger){
                System.out.print(numbers[i] + " ");
            }
            bigger=true;
        }


    }
}
