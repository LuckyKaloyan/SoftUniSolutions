package AdvancedModule.AlgorithmsBasics;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SortList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
      Collections.sort(numbers);
      List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
      Collections.sort(numbersList);
      Collections.reverse(numbersList);

    }
}