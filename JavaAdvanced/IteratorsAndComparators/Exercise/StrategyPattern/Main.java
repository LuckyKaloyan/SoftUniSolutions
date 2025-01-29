package SoftUniJavaOOP.JavaAdvanced.IteratorsAndComparators.Exercise.StrategyPattern;

import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        TreeSet<Person> nameSet = new TreeSet<>(new NameComparator());
        TreeSet<Person> ageSet = new TreeSet<>(new AgeComparator());

        for (int i = 0; i < N; i++) {
            String[] info = scanner.nextLine().split(" ");
            String name = info[0];
            int age = Integer.parseInt(info[1]);
            Person person = new Person(name, age);
            nameSet.add(person);
            ageSet.add(person);
        }

        for (Person value : nameSet) {
            System.out.println(value);
        }

        for (Person person : ageSet) {
            System.out.println(person);
        }
    }
}
