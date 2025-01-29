package AdvancedModule.FunctionalProgramming.Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> guests = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        String command = scanner.nextLine();

        while (!command.equals("Party!")) {
            String[] commandTokens = command.split(" ");

            Predicate<String> predicate = null;

            switch (commandTokens[1]) {
                case "StartsWith":
                    predicate = text -> text.startsWith(commandTokens[2]);
                    break;
                case "EndsWith":
                    predicate = text -> text.endsWith(commandTokens[2]);
                    break;
                case "Length":
                    final int lengthParameter = Integer.parseInt(commandTokens[2]);
                    predicate = text -> text.length() == lengthParameter;
                    break;
            }

            if (commandTokens[0].equals("Remove")) {
                guests.removeIf(predicate);
            }

            if (commandTokens[0].equals("Double")) {
                List<String> doubledList = new ArrayList<>();
                final Predicate<String> finalPredicate = predicate;
                guests.forEach(guest -> {
                    if (finalPredicate.test(guest)) {
                        doubledList.add(guest);
                    }
                    doubledList.add(guest);
                });
                guests.clear();
                guests.addAll(doubledList);
            }

            command = scanner.nextLine();
        }

        if (guests.isEmpty()) {
            System.out.println("Nobody is going to the party!");
        } else {
            System.out.println(guests.stream().sorted().collect(Collectors.joining(", ")) + " are going to the party!");
        }
    }
}