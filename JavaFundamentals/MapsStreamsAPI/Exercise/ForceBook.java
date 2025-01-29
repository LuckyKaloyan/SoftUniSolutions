package FundamentalsModule.MapsStreamsAPI.Exercise;

import java.util.*;

public class ForceBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> forceSides = new LinkedHashMap<>();

        String input;
        while (true) {
            input = scanner.nextLine();
            if (input.equals("Lumpawaroo")) {
                break;
            }

            if (input.contains(" | ")) {
                String[] parts = input.split(" \\| ");
                String forceSide = parts[0];
                String forceUser = parts[1];

                boolean userExists = false;
                for (List<String> users : forceSides.values()) {
                    if (users.contains(forceUser)) {
                        userExists = true;
                        break;
                    }
                }

                if (!userExists) {
                    forceSides.computeIfAbsent(forceSide, k -> new ArrayList<>()).add(forceUser);
                }
            } else if (input.contains(" -> ")) {
                String[] parts = input.split(" -> ");
                String forceUser = parts[0];
                String forceSide = parts[1];

                boolean userExists = false;
                String currentSide = "";

                for (Map.Entry<String, List<String>> entry : forceSides.entrySet()) {
                    if (entry.getValue().contains(forceUser)) {
                        userExists = true;
                        currentSide = entry.getKey();
                        break;
                    }
                }

                if (userExists) {
                    forceSides.get(currentSide).remove(forceUser);
                }

                forceSides.computeIfAbsent(forceSide, k -> new ArrayList<>()).add(forceUser);
                System.out.printf("%s joins the %s side!\n", forceUser, forceSide);
            }
        }

        for (Map.Entry<String, List<String>> entry : forceSides.entrySet()) {
            if (!entry.getValue().isEmpty()) {
                System.out.printf("Side: %s, Members: %d\n", entry.getKey(), entry.getValue().size());
                for (String user : entry.getValue()) {
                    System.out.printf("! %s\n", user);
                }
            }
        }
    }
}
