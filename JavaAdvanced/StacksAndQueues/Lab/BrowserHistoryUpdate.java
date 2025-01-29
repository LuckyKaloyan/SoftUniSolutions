package AdvancedModule.StacksAndQueues.Lab;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class BrowserHistoryUpdate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<String> history = new ArrayDeque<>();
        Deque<String> forwardPages = new ArrayDeque<>();
        String current = "";

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("Home")) {
                break;
            } else if (input.equals("back")) {
                if (history.isEmpty()) {
                    System.out.println("no previous URLs");
                } else {
                    forwardPages.addFirst(current);
                    current = history.pop();
                    System.out.println(current);
                }
            } else if (input.equals("forward")) {
                if (forwardPages.isEmpty()) {
                    System.out.println("no next URLs");
                } else {
                    history.push(current);
                    current = forwardPages.pollFirst();
                    System.out.println(current);
                }
            } else {
                if (!current.isEmpty()) {
                    history.push(current);
                    forwardPages.clear();
                }
                current = input;
                System.out.println(current);
            }
        }
    }
}
