package FundamentalsModule.Regex.Exercise;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StarEnigma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<String> attack = new ArrayList<>();
        List<String> destroyed = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String data = scanner.nextLine();
            int count = 0;
            for (int j = 0; j < data.length(); j++) {
                char current = data.charAt(j);
                if (current == 's' || current == 'S' || current == 't' || current == 'T' ||
                        current == 'a' || current == 'A' || current == 'r' || current == 'R') {
                    count++;
                }
            }
            StringBuilder sb = new StringBuilder();
            for (int k = 0; k < data.length(); k++) {
                char current = (char) (data.charAt(k) - count);
                sb.append(current);
            }
            String decoded = sb.toString();
            String regex = "@(?<planetName>[A-Za-z]+)[^@\\-!:>]*:(?<population>\\d+)[^@\\-!:>]*!(?<attackType>A|D)![^@\\-!:>]*->(?<soldierCount>\\d+)";
            java.util.regex.Pattern pattern = java.util.regex.Pattern.compile(regex);
            java.util.regex.Matcher matcher = pattern.matcher(decoded);

            while (matcher.find()) {
                String planetName = matcher.group("planetName");
                String attackType = matcher.group("attackType");

                if (attackType.equals("A")) {
                    attack.add(planetName);
                } else if (attackType.equals("D")) {
                    destroyed.add(planetName);
                }
            }
        }

        System.out.printf("Attacked planets: %d%n", attack.size());
        attack.stream()
                .sorted()
                .forEach(s -> System.out.println(String.format("-> %s", s)));

        System.out.printf("Destroyed planets: %d%n", destroyed.size());
        destroyed.stream()
                .sorted()
                .forEach(s -> System.out.println(String.format("-> %s", s)));
    }
}
