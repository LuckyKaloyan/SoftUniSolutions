package AdvancedModule.MultidimensionalArrays.Exercise;
import java.util.Scanner;
public class FillTheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(", ");
        int size = Integer.parseInt(input[0]);
        String type = input[1];
        if (type.equals("A")) {
            for (int i = 1; i <= size; i++) {
                for (int j = 0; j < size; j++) {
                    System.out.print(i + j * size + " ");
                }
                System.out.println();}}
        if (type.equals("B")) {
            for(int i=1; i<=size; i++){
                for(int j=0; j<size; j++){
                    if(j%2==0){
                        System.out.print(i+j*size+" ");
                    }else{
                        System.out.print((j*size)+size-i+1+" ");
                    }
                }System.out.println();
            }
        }
    }
}