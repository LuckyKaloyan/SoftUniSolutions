package AdvancedModule.MultidimensionalArrays.Exercise;
import java.util.Arrays;
import java.util.Scanner;
public class MatrixOfPalindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] input = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for(int i=0; i<input[0]; i++){
            for(int j=0; j<input[1]; j++){
                char number = (char)(97+i);
                char middlenumber = (char)(97+i+j);
                System.out.print(number);System.out.print(middlenumber);System.out.print(number+" ");
            }
            System.out.println();
        }
    }
}