package FundamentalsModule.Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;
public class MaxSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[]array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int longest = 0;
        int longestsaved = 0;
        int longestsavedvalue = 0;
        int lastvalue = 91919199;

        for(int i=0; i<array.length; i++){



            if(array[i]==lastvalue){longest++;
                if(longest>longestsaved){longestsaved=longest;
                    longestsavedvalue=array[i];}}
            else{longest=0;}
            lastvalue=array[i];
        }

        for(int i=0; i<=longestsaved; i++){
            System.out.print(longestsavedvalue + " ");
        }




    }
}
