package AdvancedModule.FunctionalProgramming.Exercise;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class CustomMinFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Function<int[],Integer> smallest = k -> {
            int d = Integer.MAX_VALUE;
            for (Integer integer : k) {
                if (integer < d) {
                    d = integer;
                }
            }
            return d;
        };
        int[] dd = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        System.out.println(smallest.apply(dd));
    }
}