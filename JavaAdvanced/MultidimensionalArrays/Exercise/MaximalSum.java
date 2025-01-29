package AdvancedModule.MultidimensionalArrays.Exercise;
import java.util.Arrays;
import java.util.Scanner;
public class MaximalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      int[]input = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      int[][] arreiche = new int[input[0]][input[1]];
      for(int i=0; i<input[0]; i++){
          arreiche[i]=Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      }
      int one = 0;
      int two = 0;
      int three = 0;
      int four = 0;
      int five = 0;
      int six = 0;
      int seven =0;
      int eight = 0;
      int nine = 0;
      int max = Integer.MIN_VALUE;
      for(int i=1; i<input[0]-1; i++){
          for(int j=1; j<input[1]-1; j++){
              if(arreiche[i-1][j-1]+arreiche[i-1][j]+arreiche[i-1][j+1]+arreiche[i][j-1]+arreiche[i][j]+arreiche[i][j+1]
              +arreiche[i+1][j-1]+arreiche[i+1][j]+arreiche[i+1][j+1]>max){
                  max = arreiche[i-1][j-1]+arreiche[i-1][j]+arreiche[i-1][j+1]+arreiche[i][j-1]+arreiche[i][j]+arreiche[i][j+1]
                          +arreiche[i+1][j-1]+arreiche[i+1][j]+arreiche[i+1][j+1];
                  one = arreiche[i-1][j-1];
                  two = arreiche[i-1][j];
                  three = arreiche[i-1][j+1];
                  four = arreiche[i][j-1];
                  five = arreiche[i][j];
                  six = arreiche[i][j+1];
                  seven = arreiche[i+1][j-1];
                  eight = arreiche[i+1][j];
                  nine = arreiche[i+1][j+1];
              }
          }
      }
        System.out.println("Sum = "+max);
        System.out.println(one+" "+two+" "+three);
        System.out.println(four+" "+five+" "+six);
        System.out.println(seven+" "+eight+" "+nine);
    }
}