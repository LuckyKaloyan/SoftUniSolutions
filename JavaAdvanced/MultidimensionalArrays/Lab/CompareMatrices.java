package AdvancedModule.MultidimensionalArrays.Lab;
import java.util.Arrays;
import java.util.Scanner;
public class CompareMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] splitted = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[][] arreiche = new int[splitted[0]][splitted[1]];
        for(int i=0; i<splitted[0]; i++){
            arreiche[i]=Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        int[] splitted2 = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[][] arreiche2 = new int[splitted2[0]][splitted2[1]];
        for(int i=0; i<splitted2[0]; i++){
            arreiche2[i]=Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }
        boolean isWrong = false;
        if(arreiche.length!=arreiche2.length || arreiche[0].length!=arreiche2[0].length){
            isWrong = true;
        }else{
            for(int i=0; i<splitted[0]; i++){
                for(int j=0; j<splitted[1]; j++){
                    if(arreiche[i][j]!=arreiche2[i][j]){
                        isWrong=true;
                        break;
                    }
                }if(isWrong){break;}
            }
        }
        if(isWrong){
            System.out.println("not equal");
        }else{
            System.out.println("equal");
        }
    }
}