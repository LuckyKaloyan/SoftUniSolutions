package FundamentalsModule.MapsStreamsAPI.Lab;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class WordSynonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int times = Integer.parseInt(scanner.nextLine());
        LinkedHashMap<String, ArrayList<String>> words = new LinkedHashMap<>();

        for (int i = 0; i < times; i++) {
            String word = scanner.next();
            String synonyms = scanner.next();

            words.putIfAbsent(word, new ArrayList<>());
            words.get(word).add(synonyms);
        }


        for (Map.Entry<String, ArrayList<String>> entry : words.entrySet()) {
            String word = entry.getKey();
            ArrayList<String> synonyms = entry.getValue();

            System.out.print(word + " - ");
            for (int j = 0; j < synonyms.size(); j++) {
                System.out.print(synonyms.get(j));
                if (j < synonyms.size() - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
    }
}
