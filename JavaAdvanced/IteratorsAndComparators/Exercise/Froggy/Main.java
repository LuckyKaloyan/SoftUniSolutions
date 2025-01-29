package SoftUniJavaOOP.JavaAdvanced.IteratorsAndComparators.Exercise.Froggy;
import java.util.Scanner;
import java.util.Iterator;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] numbersStr = scanner.nextLine().split(", ");
        int[] numbers = new int[numbersStr.length];
        for (int i = 0; i < numbersStr.length; i++) {
            numbers[i] = Integer.parseInt(numbersStr[i]);
        }

        Lake lake = new Lake(numbers);
        Iterator<Integer> iterator = lake.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next());
            if (iterator.hasNext()) {
                System.out.print(", ");
            }
        }

        scanner.close();
    }
}
