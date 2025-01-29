package FundamentalsModule.MapsStreamsAPI.Lab;

import java.util.Arrays;
import java.util.Scanner;
public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[]numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int counter = 1;

        Arrays.sort(numbers);

        for(int i=0; i<numbers.length-1; i++){

            if(numbers[i]==numbers[i+1]){
                counter++;
            }else{
                System.out.println(numbers[i]+" -> "+counter);
                counter = 1;
            }
        }
        System.out.println(numbers[numbers.length - 1] + " -> " + counter);

    }
}
