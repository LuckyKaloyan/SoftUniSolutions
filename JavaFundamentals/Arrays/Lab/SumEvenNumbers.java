package FundamentalsModule.Arrays.Lab;

import java.util.Arrays;
import java.util.Scanner;
public class SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int[] arai = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for(int i=0; i<arai.length; i++){
            if(arai[i]%2==0){sum=sum+arai[i];}
        }

        System.out.println(sum);
    }
}
