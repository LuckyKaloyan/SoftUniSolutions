package AdvancedModule.MultidimensionalArrays.Exercise;
import java.util.Arrays;
import java.util.Scanner;
public class MatrixShuffling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] input = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[][] arreiche = new int[input[0]][input[1]];
        for(int i=0; i<input[0]; i++){
            arreiche[i]=Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }
        int rubber;
        while(true){
            String command = scanner.nextLine();
            if(command.equals("END")){break;}
            String[] splitted =  command.split(" ");

if((!splitted[0].equals("swap"))){
                System.out.println("Invalid input!");
            }else {
    try {
        rubber=arreiche[Integer.parseInt(splitted[1])][Integer.parseInt(splitted[2])];
        arreiche[Integer.parseInt(splitted[1])][Integer.parseInt(splitted[2])]=
                arreiche[Integer.parseInt(splitted[3])][Integer.parseInt(splitted[4])];
        arreiche[Integer.parseInt(splitted[3])][Integer.parseInt(splitted[4])]=rubber;
        for(int i=0; i<input[0]; i++){
            for(int j=0; j<input[1]; j++){
                System.out.print(arreiche[i][j]+" ");
            }
            System.out.println();
        }

    } catch (Exception haha) {
        System.out.println("Invalid input!");
    }
}
        }
    }
}