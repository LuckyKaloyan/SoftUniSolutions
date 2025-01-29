package FundamentalsModule.Arrays.Lab;

import java.util.Arrays;
import java.util.Scanner;
public class EvenOddSubstraction {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sumeven = 0;
        int sumodd = 0;
        int[] arai = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for(int i=0; i<arai.length; i++){
            if(arai[i]%2==0){sumeven=sumeven+arai[i];}
            if(arai[i]%2==1){sumodd=sumodd+arai[i];}
        }

        System.out.println(sumeven-sumodd);
    }


}
