package AdvancedModule.StacksAndQueues.Lab;

import java.util.PriorityQueue;
import java.util.Scanner;

public class MathPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = scanner.nextLine().split(" ");
        int n = Integer.parseInt(scanner.nextLine());

        PriorityQueue<String> kid = new PriorityQueue<>();
        for (String name : names) {
            kid.offer(name);
        }

        int cycle = 1;
        while (kid.size() > 1) {
            for (int i = 1; i < n; i++) {
                kid.offer(kid.poll());
            }
            if (!isPrimeNumber(cycle)) {
                System.out.printf("Removed %s%n", kid.poll());
            } else {
                System.out.printf("Prime %s%n", kid.peek());
            }
            cycle++;
        }

        System.out.printf("Last is %s%n", kid.poll());
    }

    private static boolean isPrimeNumber(int cycle) {
        if (cycle <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(cycle); i++) {
            if (cycle % i == 0) {
                return false;
            }
        }
        return true;
    }
}
