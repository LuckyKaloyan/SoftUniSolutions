package FundamentalsModule.Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;
public class ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int move = Integer.parseInt(scanner.nextLine());


        if(move>=array.length){

            while(move>=array.length){{
                move=move-array.length;}
                if(move< array.length){break;}}
        }


        int[] array2 = new int[array.length];


        for(int i=0; i<array.length; i++){
            if(i+move<=array2.length-1){array2[i]=array[i+move];}
            else{array2[i]=array[move+i-array.length];}
        }
        for(int i=0; i<array.length; i++){
            System.out.print(array2[i] + " ");
        }
    }
}
