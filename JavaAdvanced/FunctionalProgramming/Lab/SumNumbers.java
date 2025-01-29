package AdvancedModule.FunctionalProgramming.Lab;
import java.util.*;
import java.util.function.Function;
public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Function<String, Integer> sum = s -> Arrays.stream(s.split(", ")).mapToInt(Integer::parseInt).sum();
        Function<String, Integer> length = s -> {
            String[] k = s.split(", ");
            return k.length;
        };
        String input = scanner.nextLine();
        Integer summed = sum.apply(input);
        Integer lengthed = length.apply(input);
        System.out.println("Count = "+lengthed);
        System.out.println("Sum = "+summed);

    }
}
