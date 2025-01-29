package AdvancedModule.MultidimensionalArrays.Lab;
import java.util.Scanner;
public class IntersectionOfTwoMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    int number = Integer.parseInt(scanner.nextLine());
    int elements = Integer.parseInt(scanner.nextLine());
    String[][]arreiche = new String [number][elements];
    for(int i=0; i<number; i++){
        arreiche[i]=scanner.nextLine().split(" ");
    }
        String[][]arreiche2 = new  String[number][elements];
    for(int i=0; i<number; i++){
        arreiche2[i]=scanner.nextLine().split(" ");
    }
    for(int i=0; i<number; i++){
        for(int j=0; j<elements; j++){
            if(arreiche[i][j].equals(arreiche2[i][j])){
                System.out.print(arreiche[i][j]+" ");
            }else{
                System.out.print("* ");
            }
        }
        System.out.println();
    }
    }
}