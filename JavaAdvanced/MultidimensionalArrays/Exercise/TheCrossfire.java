package AdvancedModule.MultidimensionalArrays.Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class TheCrossfire {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] dimensions = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int rows = dimensions[0];
        int cols = dimensions[1];
        List<List<Integer>> matrix = new ArrayList<>();
        for (int i = 0; i < rows; i++) {
            matrix.add(new ArrayList<Integer>());
            for (int j = 0; j < cols; j++) {
                matrix.get(i).add(i * cols + j + 1);
            }
        }
        String input = scanner.nextLine();
        while (!input.equals("Nuke it from orbit")) {
            int[] command = Arrays.stream(input.split(" ")).mapToInt(Integer::parseInt).toArray();
            int row = command[0];
            int col = command[1];
            int radius = command[2];
            for (int i = row - radius; i <= row + radius; i++) {
                if (i >= 0 && i < matrix.size() && col >= 0 && col < matrix.get(i).size()) {
                    matrix.get(i).set(col, 0);
                }
            }
            for (int i = col - radius; i <= col + radius; i++) {
                if (row >= 0 && row < matrix.size() && i >= 0 && i < matrix.get(row).size()) {
                    matrix.get(row).set(i, 0);
                }
            }
            for (int i = 0; i < matrix.size(); i++) {
                matrix.get(i).removeIf(e -> e == 0);
                if (matrix.get(i).isEmpty()) {
                    matrix.remove(i);
                    i--;
                }
            }
            input = scanner.nextLine();
        }
        for (List<Integer> row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}