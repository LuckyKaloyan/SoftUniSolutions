package FundamentalsModule.Lists.MoreExercises;

import java.util.*;
import java.util.stream.Collectors;

public class Messaging {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String word = scanner.nextLine();

        StringBuilder output = new StringBuilder();

        for (int k = 0; k < numbers.size(); k++) {
            int number = numbers.get(k);
            int total = 0;
            for (int i = 0; i < word.length(); i++) {
                total = total + number % 10;
                number = number / 10;
            }
            while (total > word.length()) {
                total = total - word.length();
            }
            output.append(word.charAt(total));
            word = word.substring(0, total) + word.substring(total + 1);
        }

        System.out.println(output.toString());
    }
}
