package FundamentalsModule.Lists.Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AnonymousThreat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> input = new ArrayList<>(Arrays.asList(scanner.nextLine().split(" ")));

        String word = scanner.nextLine();

        while (!word.equals("3:1")) {
            String[] parts = word.split(" ");
            String command = parts[0];

            if (command.equals("merge")) {
                int startIndex = Integer.parseInt(parts[1]);
                int endIndex = Integer.parseInt(parts[2]);

                if (startIndex < 0) {
                    startIndex = 0;
                }
                if (endIndex >= input.size()) {
                    endIndex = input.size() - 1;
                }

                for (int i = startIndex; i < endIndex; i++) {
                    input.set(startIndex, input.get(startIndex) + input.get(startIndex + 1));
                    input.remove(startIndex + 1);
                }
            } else if (command.equals("divide")) {
                int index = Integer.parseInt(parts[1]);
                int partitions = Integer.parseInt(parts[2]);

                String str = input.get(index);
                int partLength = str.length() / partitions;

                List<String> dividedParts = new ArrayList<>();

                for (int i = 0; i < partitions - 1; i++) {
                    dividedParts.add(str.substring(i * partLength, (i + 1) * partLength));
                }

                dividedParts.add(str.substring((partitions - 1) * partLength));

                input.remove(index);
                input.addAll(index, dividedParts);
            }

            word = scanner.nextLine();
        }

        for (String str : input) {
            System.out.print(str + " ");
        }
    }
}
