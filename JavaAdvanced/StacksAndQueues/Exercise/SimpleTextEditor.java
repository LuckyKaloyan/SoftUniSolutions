package AdvancedModule.StacksAndQueues.Exercise;

import java.util.*;

public class SimpleTextEditor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();

        Stack<String> operations = new Stack<>();
        StringBuilder text = new StringBuilder();

        for (int i = 0; i < N; i++) {
            String operation = scanner.nextLine();
            String[] parts = operation.split(" ");

            if (parts[0].equals("1")) {
                operations.push(text.toString());
                text.append(parts[1]);
            } else if (parts[0].equals("2")) {
                operations.push(text.toString());
                int count = Integer.parseInt(parts[1]);
                text.delete(text.length() - count, text.length());
            } else if (parts[0].equals("3")) {
                int index = Integer.parseInt(parts[1]) - 1;
                System.out.println(text.charAt(index));
            } else if (parts[0].equals("4")) {
                if (!operations.isEmpty()) {
                    text = new StringBuilder(operations.pop());
                }
            }
        }

        scanner.close();
    }
}
