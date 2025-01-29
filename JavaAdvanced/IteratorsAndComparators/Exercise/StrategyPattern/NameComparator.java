package SoftUniJavaOOP.JavaAdvanced.IteratorsAndComparators.Exercise.StrategyPattern;

import java.util.Comparator;

class NameComparator implements Comparator<Person> {
    public int compare(Person a, Person b) {
        if (a.name.length() != b.name.length()) {
            return a.name.length() - b.name.length();
        } else {
            return Character.compare(Character.toLowerCase(a.name.charAt(0)), Character.toLowerCase(b.name.charAt(0)));
        }
    }
}
