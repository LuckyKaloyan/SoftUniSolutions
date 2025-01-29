package AdvancedModule.FunctionalProgramming.Lab;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CountUppercaseWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Predicate<String> isUpperCase = s -> Character.isUpperCase(s.charAt(0));
        List<String> listche = Arrays.stream(scanner.nextLine().split(" ")).filter(isUpperCase).
                collect(Collectors.toList());
        System.out.println(listche.size());
        for(String s:listche){
            System.out.println(s);
        }
    }
}