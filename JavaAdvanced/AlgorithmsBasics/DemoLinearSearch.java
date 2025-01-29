package AdvancedModule.AlgorithmsBasics;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class DemoLinearSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine()
                                .split(" "))
                                .map(Integer::parseInt)
                                .collect(Collectors.toList());

        int searchedNumber = Integer.parseInt(scanner.nextLine());

        for (int index = 0; index <= numbers.size() - 1 ; index++) {
            int currentNumber = numbers.get(index);
            if (currentNumber == searchedNumber) {
                System.out.println(index);
                break;
            }
        }
    }
}
