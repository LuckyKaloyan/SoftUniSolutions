package FundamentalsModule.FinalExamPreparation;

import java.util.*;

public class PlantDiscovery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Integer> exhibition = new LinkedHashMap<>();
        Map<String, List<Double>> rating = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("<->");

            if (!exhibition.containsKey(input[0])) {
                exhibition.put(input[0], Integer.parseInt(input[1]));
            } else {
                exhibition.remove(input[0]);
                exhibition.put(input[0], Integer.parseInt(input[1]));
            }
        }

        String[] command = scanner.nextLine().split("[\\-:\\s]+");

        while (!command[0].equals("Exhibition")) {

            if (command[0].equals("Rate")) {
                if (exhibition.containsKey(command[1])) {
                    rating.computeIfAbsent(command[1], k -> new ArrayList<>()).add(Double.parseDouble(command[2]));
                } else {
                    System.out.println("error");
                }
            } else if (command[0].equals("Update")) {
                if (exhibition.containsKey(command[1])) {
                    exhibition.remove(command[1]);
                    exhibition.put(command[1], Integer.parseInt(command[2]));
                } else {
                    System.out.println("error");
                }
            } else if (command[0].equals("Reset")) {
                if (rating.containsKey(command[1])) {
                    rating.remove(command[1]);
                } else {
                    System.out.println("error");
                }
            } else {
                System.out.println("error");
            }

            command = scanner.nextLine().split("[\\-:\\s]+");
        }

        Map<String, List<Double>> union = new LinkedHashMap<>();

        for (Map.Entry<String, Integer> entry : exhibition.entrySet()) {
            String key = entry.getKey();
            int rarity = entry.getValue();

            union.put(key, new ArrayList<>());
            union.get(key).add((double) rarity);

            if (rating.containsKey(key)) {
                union.get(key).add(rating.get(key).stream().mapToDouble(Double::doubleValue).average().orElse(0.0));
                continue;
            }

            union.get(key).add(0.0);
        }

        System.out.println("Plants for the exhibition:");
        union.entrySet().stream()
                .sorted((e1, e2) -> {
                    int compareRarity = e2.getValue().get(0).compareTo(e1.getValue().get(0));
                    if (compareRarity == 0) {
                        return e2.getValue().get(1).compareTo(e1.getValue().get(1));
                    }
                    return compareRarity;
                })
                .forEach(item -> System.out.printf(" - %s; Rarity: %.0f; Rating: %.2f%n", item.getKey(), item.getValue().get(0), item.getValue().get(1)));
    }
}
