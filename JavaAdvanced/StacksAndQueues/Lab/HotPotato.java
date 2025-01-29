package AdvancedModule.StacksAndQueues.Lab;
import java.util.ArrayDeque;
import java.util.Scanner;


public class HotPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> kids = new ArrayDeque<>();

        String[] word = scanner.nextLine().split(" ");
        int turns = Integer.parseInt(scanner.nextLine());

        int count = word.length;
        for (int i = 0; i < count; i++) {
            kids.offer(word[i]);
        }

        while (kids.size() > 1) {
            for (int i = 0; i < turns - 1; i++) {
                String currentKid = kids.poll();
                kids.offer(currentKid);
            }
            System.out.println("Removed " + kids.poll());
        }

        System.out.println("Last is " + kids.poll());
    }
}
