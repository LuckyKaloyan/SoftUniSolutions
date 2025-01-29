package SoftUniJavaOOP.JavaAdvanced.DefiningClasses.Exercise.Google;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Person> people = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String[] tokens = input.split("\\s+");
            String name = tokens[0];
            String action = tokens[1];

            people.putIfAbsent(name, new Person(name));
            Person person = people.get(name);

            switch (action) {
                case "company":
                    person.setCompany(new Company(tokens[2], tokens[3], Double.parseDouble(tokens[4])));
                    break;
                case "car":
                    person.setCar(new Car(tokens[2], Integer.parseInt(tokens[3])));
                    break;
                case "pokemon":
                    person.addPokemon(new Pokemon(tokens[2], tokens[3]));
                    break;
                case "parents":
                    person.addParent(new Parent(tokens[2], tokens[3]));
                    break;
                case "children":
                    person.addChild(new Child(tokens[2], tokens[3]));
                    break;
            }
            input = scanner.nextLine();
        }
        String targetName = scanner.nextLine();
        people.get(targetName).printInfo();
    }
}
