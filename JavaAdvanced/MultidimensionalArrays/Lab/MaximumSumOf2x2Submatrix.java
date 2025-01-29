package AdvancedModule.MultidimensionalArrays.Lab;
import java.util.Arrays;
import java.util.Scanner;
public class MaximumSumOf2x2Submatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    int[] input = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
    int [][] arreiche = new int[input[0]][input[1]];
    for(int i=0; i<input[0]; i++){
      arreiche[i]=Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
    }
    int max = Integer.MIN_VALUE;
    int edno = 0;
    int dve = 0;
    int tri = 0;
    int chetiri = 0;
    for(int i=0; i<input[0]-1; i++){
        for(int j=0; j<input[1]-1; j++){
            if((arreiche[i][j]+arreiche[i][j+1]+arreiche[i+1][j]+arreiche[i+1][j+1])>max){
                max = (arreiche[i][j]+arreiche[i+1][j]+arreiche[i][j+1]+arreiche[i+1][j+1]);
                edno = arreiche[i][j];
                dve = arreiche[i][j+1];
                tri = arreiche[i+1][j];
                chetiri = arreiche[i+1][j+1];
            }

        }
    }
        System.out.println(edno+" "+dve);
        System.out.println(tri+" "+chetiri);
        System.out.println(max);
    }
}