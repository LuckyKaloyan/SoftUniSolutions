package AdvancedModule.StacksAndQueues.Exercise;
import java.util.ArrayDeque;
import java.util.Scanner;


public class BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] inputParams = scanner.nextLine().split(" ");
        int N = Integer.parseInt(inputParams[0]);
        int S = Integer.parseInt(inputParams[1]);
        int X = Integer.parseInt(inputParams[2]);

        String[] numbers = scanner.nextLine().split(" ");

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < N; i++) {
            stack.push(Integer.parseInt(numbers[i]));
        }

        for (int i = 0; i < S; i++) {
            if (!stack.isEmpty()) {
                stack.pop();
            }
        }


        if (stack.contains(X)) {
            System.out.println("true");
        } else if (!stack.isEmpty()) {
            int min = Integer.MAX_VALUE;
            for (int num : stack) {
                if (num < min) {
                    min = num;
                }
            }
            System.out.println(min);
        } else {
            System.out.println(0);
        }
    }
}

