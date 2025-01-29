package AdvancedModule.MultidimensionalArrays.Exercise;
import java.util.Arrays;
import java.util.Scanner;
public class DiagonalDifferance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());
        int[][] arreiche = new int[size][size];
        for(int i=0; i<size; i++){
            arreiche[i]= Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }
        int sum = 0;
        int sum2 = 0;
        for(int i=0; i<size; i++){
            sum=sum+arreiche[i][i];
            }
        for(int j=0; j<size; j++){
            sum2=sum2+arreiche[size-1-j][j];
        }
        System.out.println(Math.abs(sum-sum2));
        }
    }