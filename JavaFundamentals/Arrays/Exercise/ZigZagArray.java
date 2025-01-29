package FundamentalsModule.Arrays.Exercise;

import java.util.Scanner;
public class ZigZagArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());
        int[] array1 = new int[rows];
        int[] array2 = new int[rows];


        for(int i=0; i<rows; i++){
            if(i%2==1){array1[i]=scanner.nextInt();
                array2[i]=scanner.nextInt();}

            else{array2[i]=scanner.nextInt();
                array1[i]=scanner.nextInt();}
        }


        for(int i=0; i<rows; i++){
            System.out.print(array2[i]+" ");
        }
        System.out.println();
        for(int i=0; i<rows; i++){
            System.out.print(array1[i]+" ");
        }
    }
}
