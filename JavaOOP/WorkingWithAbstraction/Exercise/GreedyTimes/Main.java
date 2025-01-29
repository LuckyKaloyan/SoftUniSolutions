package SoftUniJavaOOP.OOP.WorkingWithAbstraction.Exercise.GreedyTimes;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        long capacity = Long.parseLong(scanner.nextLine());
        String[] items = scanner.nextLine().split("\\s+");

        LinkedHashMap<String, LinkedHashMap<String, Long>> torba = new LinkedHashMap<>();

        long gold= 0;
        long gems = 0;
        long cash = 0;

        for (int i = 0; i < items.length; i += 2) {
            String itemsName = items[i];
            long count = Long.parseLong(items[i + 1]);

            String command = "";

            if (itemsName.length() == 3) {
                command = "Cash";
            } else if (itemsName.toLowerCase().endsWith("gem")) {
                command = "Gem";
            } else if (itemsName.equalsIgnoreCase("gold")) {
                command = "Gold";
            }

            if (command.isEmpty()) {
                continue;
            } else if (capacity < torba.values().stream().map(Map::values).flatMap(Collection::stream).mapToLong(e -> e).sum() + count) {
                continue;
            }

            switch (command) {
                case "Gem":
                    if (!torba.containsKey(command)) {
                        if (torba.containsKey("Gold")) {
                            if (count > torba.get("Gold").values().stream().mapToLong(e -> e).sum()) {
                                continue;
                            }
                        } else {
                            continue;
                        }
                    } else if (torba.get(command).values().stream().mapToLong(e -> e).sum() + count > torba.get("Gold").values().stream().mapToLong(e -> e).sum()) {
                        continue;
                    }
                    break;
                case "Cash":
                    if (!torba.containsKey(command)) {
                        if (torba.containsKey("Gem")) {
                            if (count > torba.get("Gold").values().stream().mapToLong(e -> e).sum()) {
                                continue;
                            }
                        } else {
                            continue;
                        }
                    } else if (torba.get(command).values().stream().mapToLong(e -> e).sum() + count > torba.get("Gem").values().stream().mapToLong(e -> e).sum()) {
                        continue;
                    }
                    break;
            }

            if (!torba.containsKey(command)) {
                torba.put((command), new LinkedHashMap<>());
            }

            if (!torba.get(command).containsKey(itemsName)) {
                torba.get(command).put(itemsName, 0L);
            }


            torba.get(command).put(itemsName, torba.get(command).get(itemsName) + count);
            switch (command) {
                case "Gold":
                    gold += count;
                    break;
                case "Gem":
                    gems += count;
                    break;
                case "Cash":
                    cash += count;
                    break;
            }
        }

        for (var x : torba.entrySet()) {
            Long sumValues = x.getValue().values().stream().mapToLong(l -> l).sum();

            System.out.printf("<%s> $%s%n", x.getKey(), sumValues);

            x.getValue().entrySet().stream().sorted((e1, e2) -> e2.getKey().compareTo(e1.getKey())).forEach(i -> System.out.println("##" + i.getKey() + " - " + i.getValue()));

        }
    }
}