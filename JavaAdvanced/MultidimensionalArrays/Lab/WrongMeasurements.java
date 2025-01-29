package AdvancedModule.MultidimensionalArrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class WrongMeasurements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = readMatrix(scanner);
        int[][] newMatrix = makeNewMatrix(matrix, scanner);
        printMatrix(newMatrix);
    }

    private static int[][] readMatrix(Scanner scanner) {
        int n = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[n][];
        for (int i = 0; i < n; i++) {
            matrix[i] = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }
        return matrix;
    }

    private static int[][] makeNewMatrix(int[][] matrix, Scanner scanner) {
        int[][] newMatrix = new int[matrix.length][];
        int[] index = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int row = index[0];
        int col = index[1];
        int wrongNumber = matrix[row][col];

        for (int r = 0; r < matrix.length; r++) {
            int[] newRow = new int[matrix[r].length];
            for (int c = 0; c < matrix[r].length; c++) {
                if (matrix[r][c] == wrongNumber) {
                    newRow[c] = getCorrectedValue(matrix, r, c, wrongNumber);
                } else {
                    newRow[c] = matrix[r][c];
                }
            }
            newMatrix[r] = newRow;
        }
        return newMatrix;
    }

    private static int getCorrectedValue(int[][] matrix, int row, int col, int wrongNumber) {
        int sum = 0;
        if (col > 0 && matrix[row][col - 1] != wrongNumber) {
            sum += matrix[row][col - 1];
        }
        if (col < matrix[row].length - 1 && matrix[row][col + 1] != wrongNumber) {
            sum += matrix[row][col + 1];
        }
        if (row > 0 && matrix[row - 1][col] != wrongNumber) {
            sum += matrix[row - 1][col];
        }
        if (row < matrix.length - 1 && matrix[row + 1][col] != wrongNumber) {
            sum += matrix[row + 1][col];
        }
        return sum;
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int cell : row) {
                System.out.printf("%d ", cell);
            }
            System.out.println();
        }
    }
}
