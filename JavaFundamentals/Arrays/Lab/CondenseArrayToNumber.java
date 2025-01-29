package FundamentalsModule.Arrays.Lab;

import java.util.Arrays;
import java.util.Scanner;


public class CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for(int i=array.length-1; i>0; i--){
            int[] condensed = new int[array.length-1];

            for(int k=0; k<condensed.length; k++){
                condensed[k]=array[k]+array[k+1];
            }

            for(int o=0; o<condensed.length; o++){
                array[o]=condensed[o];
            }
        }
        System.out.println(array[0]);

    }
}
