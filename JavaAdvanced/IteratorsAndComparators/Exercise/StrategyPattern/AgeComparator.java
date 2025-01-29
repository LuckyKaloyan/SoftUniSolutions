package SoftUniJavaOOP.JavaAdvanced.IteratorsAndComparators.Exercise.StrategyPattern;

import java.util.Comparator;

class AgeComparator implements Comparator<Person> {
    public int compare(Person a, Person b) {
        return a.age - b.age;
    }
}
