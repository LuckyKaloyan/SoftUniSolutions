package FundamentalsModule.Lists.Exercise;

import java.util.ArrayList;
import java.util.Scanner;

public class PokemonDontGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputSequence = scanner.nextLine().split(" ");
        ArrayList<Integer> sequence = new ArrayList<>();
        int points = 0;

        for (String element : inputSequence) {
            sequence.add(Integer.parseInt(element));
        }

        while (!sequence.isEmpty()) {
            int index = scanner.nextInt();
            int num = 0;

            if (0 <= index && index < sequence.size()) {
                num = sequence.remove(index);
            } else if (index < 0) {
                int numToAdd = sequence.get(sequence.size() - 1);
                num = sequence.get(0);
                sequence.set(0, numToAdd);
            } else {
                int numToAdd = sequence.get(0);
                num = sequence.get(sequence.size() - 1);
                sequence.set(sequence.size() - 1, numToAdd);
            }

            points += num;

            for (int current_index = 0; current_index < sequence.size(); current_index++) {
                int current_num = sequence.get(current_index);
                if (current_num <= num) {
                    sequence.set(current_index, current_num + num);
                } else {
                    sequence.set(current_index, current_num - num);
                }
            }
        }

        System.out.println(points);
    }
}
