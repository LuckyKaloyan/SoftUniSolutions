package AdvancedModule.MultidimensionalArrays.Lab;
import java.util.Arrays;
import java.util.Scanner;
public class PrintDiagonalsOfSquareMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
     int input = Integer.parseInt(scanner.nextLine());
     int[][] arreiche = new int[input][input];
     for(int i=0; i<input; i++){
         arreiche[i]=Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
     }
     String firstdiagonal = "";
     String seconddiagonal = "";
        int j=0;

     for(int i=0; i<input; i++){
         firstdiagonal = firstdiagonal+String.valueOf(arreiche[i][j])+" ";
         j++;
     }
     j=0;
        for(int i=input-1; i>=0; i--){
            seconddiagonal = seconddiagonal+String.valueOf(arreiche[i][j])+" ";
            j++;
        }
        System.out.println(firstdiagonal);
        System.out.println(seconddiagonal);
    }
}