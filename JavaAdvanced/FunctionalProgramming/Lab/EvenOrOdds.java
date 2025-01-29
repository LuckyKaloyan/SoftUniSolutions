package AdvancedModule.FunctionalProgramming.Lab;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class EvenOrOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        String command = scanner.next();

        int[] result = kek(first, second, command);

        String resultString = Arrays.stream(result)
                .mapToObj(Integer::toString)
                .collect(Collectors.joining(" "));

        System.out.println(resultString);
    }

    public static int[] kek(int a, int b, String s) {
        Predicate<Integer> isOdd = i -> s.equals("odd") && i % 2 != 0;
        Predicate<Integer> isEven = i -> s.equals("even") && i % 2 == 0;

        return IntStream.rangeClosed(a, b)
                .filter(i -> isOdd.test(i) || isEven.test(i))
                .toArray();
    }
}
