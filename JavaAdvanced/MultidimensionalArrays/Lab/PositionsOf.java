package AdvancedModule.MultidimensionalArrays.Lab;
import java.util.Arrays;
import java.util.Scanner;
public class PositionsOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] size = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[][] matrix = new int[size[0]][size[1]];
        for(int i=0; i<size[0]; i++){
            matrix[i]=Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }
        int number = Integer.parseInt(scanner.nextLine());
        boolean hasSome = false;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j]==number){
                    System.out.println(i+" "+j);
                    hasSome = true;
                }
            }
        }
        if(!hasSome){
            System.out.println("not found");
        }
    }
}