package AdvancedModule.MultidimensionalArrays.Lab;
import java.util.Arrays;
import java.util.Scanner;
public class SumMatrixElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       int[] size = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
       int[][] arreiche = new int[size[0]][size[1]];
       for(int i=0; i<size[0]; i++){
       arreiche[i]=Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
       }
       int sum = 0;
       for(int i=0; i<size[0]; i++){
           for(int j=0; j<size[1]; j++){
               sum = sum+arreiche[i][j];
           }
       }
        System.out.println(size[0]);
        System.out.println(size[1]);
        System.out.println(sum);
    }
}