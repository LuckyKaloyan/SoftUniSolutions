package FundamentalsModule.Arrays.Lab;

import java.util.Arrays;
import java.util.Scanner;
public class EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[] arai1 = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] arai2 = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int wrong = 0;
        int sum = 0;


        for(int i=0; i<arai1.length; i++){
            if(arai1[i]!=arai2[i]){
                wrong++;
                System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                break;
            }
        }

        for(int i=0; i<arai1.length; i++){
            sum=sum+arai1[i];
        }

        if(wrong==0){
            System.out.printf("Arrays are identical. Sum: %d", sum );
        }
    }

}
