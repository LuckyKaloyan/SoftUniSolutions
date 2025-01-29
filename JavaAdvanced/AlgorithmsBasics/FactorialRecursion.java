package AdvancedModule.AlgorithmsBasics;

import java.util.Scanner;

public class FactorialRecursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        System.out.println(calcFact(n));

    }

    public static long calcFact (int n) {
        if (n == 1) {
            return 1;
        }
        return n * calcFact(n - 1);
    }
}
