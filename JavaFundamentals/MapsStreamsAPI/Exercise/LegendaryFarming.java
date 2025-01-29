package FundamentalsModule.MapsStreamsAPI.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, Integer> junk = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> special = new LinkedHashMap<>();
        boolean legendaryItemObtained = false;

        while (!legendaryItemObtained) {
            String[] input = scanner.nextLine().split("\\s+");

            for (int i = 0; i < input.length; i += 2) {
                int amount = Integer.parseInt(input[i]);
                String name = input[i + 1].toLowerCase();

                if (!name.equals("motes") && !name.equals("fragments") && !name.equals("shards")) {
                    junk.put(name, junk.getOrDefault(name, 0) + amount);
                } else {
                    special.put(name, special.getOrDefault(name, 0) + amount);
                    if (special.get(name) >= 250) {
                        special.put(name, special.get(name) - 250);
                        if (name.equals("shards")) {
                            System.out.println("Shadowmourne obtained!");
                        } else if (name.equals("fragments")) {
                            System.out.println("Valanyr obtained!");
                        } else if (name.equals("motes")) {
                            System.out.println("Dragonwrath obtained!");
                        }
                        legendaryItemObtained = true;
                        break;
                    }
                }
            }
        }

        System.out.println("shards: " + (special.containsKey("shards") ? special.get("shards") : 0));
        System.out.println("fragments: " + (special.containsKey("fragments") ? special.get("fragments") : 0));
        System.out.println("motes: " + (special.containsKey("motes") ? special.get("motes") : 0));

        for (Map.Entry<String, Integer> entry : junk.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
