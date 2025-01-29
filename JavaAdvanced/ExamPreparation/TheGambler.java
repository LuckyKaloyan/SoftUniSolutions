package AdvancedModule.ExamPreparation;

import java.util.Scanner;

public class TheGambler {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());
        int initialAmount = 100;
        int currentRow = 0;
        int currentColum = 0;
        int newRow = 0;
        int newColum = 0;

        String[][] board = new String[size][size];
        for (int i = 0; i < size; i++) {
            board[i] = scanner.nextLine().split("");
        }

        String command;

        while (true) {
            command = scanner.nextLine();

            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    if (board[i][j].equals("G")) { // STARTING POSITION
                        currentRow = i;
                        currentColum = j;
                        break;
                    }
                }
            }

            if (command.equals("end")) {
                break;
            }

            if (command.equals("up")) {
                newRow = currentRow - 1;
                newColum = currentColum;
            } else if (command.equals("down")) {
                newRow = currentRow + 1;
                newColum = currentColum;
            } else if (command.equals("right")) {
                newRow = currentRow;
                newColum = currentColum + 1;
            } else if (command.equals("left")) {
                newRow = currentRow;
                newColum = currentColum - 1;
            }

            if (newRow < 0 || newRow >= size || newColum < 0 || newColum >= size) {
                System.out.println("Game over! You lost everything!");
                initialAmount = 0;
                break;
            }

            if (board[newRow][newColum].equals("-")) {
                board[newRow][newColum] = "G";
                board[currentRow][currentColum] = "-";
            }
            if (board[newRow][newColum].equals("W")) {
                board[newRow][newColum] = "G";
                board[currentRow][currentColum] = "-";
                initialAmount += 100;
            }
            if (board[newRow][newColum].equals("P")) {
                board[newRow][newColum] = "G";
                board[currentRow][currentColum] = "-";
                initialAmount -= 200;
                if (initialAmount <= 0) {
                    System.out.println("Game over! You lost everything!");
                    initialAmount = 0;
                    break;
                }
            }
            if (board[newRow][newColum].equals("J")) {
                board[newRow][newColum] = "G";
                board[currentRow][currentColum] = "-";
                initialAmount += 100000;
                System.out.println("You win the Jackpot!");
                break;
            }
            currentColum = newColum;
            currentRow = newRow;
        }

        if (initialAmount > 0) {
            System.out.println("End of the game. Total amount: " + initialAmount + "$");
        }
        if(initialAmount>0){
            for(int i=0; i<size; i++){
                for(int j=0; j<size; j++){
                    System.out.print(board[i][j]);
                }
                System.out.println();
            }
        }
    }
}
