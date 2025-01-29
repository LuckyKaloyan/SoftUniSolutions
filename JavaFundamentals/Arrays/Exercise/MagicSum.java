package FundamentalsModule.Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;
public class MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);




        int[]array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int magic = Integer.parseInt(scanner.nextLine());


        for(int i=0; i<array.length; i++){
            for(int k=i+1; k<array.length; k++){
                if(array[i]+array[k]==magic){
                    System.out.println(array[i] + " " + array[k]);
                }
            }
        }


    }
}
