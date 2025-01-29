package AdvancedModule.MultidimensionalArrays.Exercise;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class ReverseMatrixDiagonals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     int[] input = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
     int[][] arreiche = new int[input[0]][];
     int max = Math.min(input[0],input[1]);

     for(int i=0; i<input[0]; i++){
         arreiche[i]=Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
     }

     List<List<Integer>> listche = new ArrayList<>();

     for(int i=arreiche.length-1; i>=0; i--){
        List<Integer> totalmess = new ArrayList<>();
       for(int j=arreiche[i].length-1; j>=0; j--){
           totalmess.add(arreiche[i][j]);
           System.out.print(arreiche[i][j]+" ");
       }
         System.out.println();
       listche.add(totalmess);
     }



     for(int i=0; i<listche.size(); i++){
         for(int k=0; k<i; k++){
             System.out.print(listche.get(i).get(0)+" ");
         }
         System.out.println();
     }



    }
}
