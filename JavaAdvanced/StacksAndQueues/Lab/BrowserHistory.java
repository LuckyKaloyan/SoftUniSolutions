package AdvancedModule.StacksAndQueues.Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<String> history = new ArrayDeque<>();
        String current = "";

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("Home")) {
                break;
            } else if (input.equals("back")) {
                if (history.isEmpty()) {
                    System.out.println("no previous URLs");
                } else {
                    current = history.pop();
                    System.out.println(current);
                }
            } else {
                if (!current.isEmpty()) {
                    history.push(current);
                }
                current = input;
                System.out.println(current);
            }
        }
    }
}
