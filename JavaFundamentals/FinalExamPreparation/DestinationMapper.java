package FundamentalsModule.FinalExamPreparation;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DestinationMapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int points = 0;
        String word = scanner.nextLine();
        Pattern pattern = Pattern.compile("(?<=(=|/))[A-Z][a-zA-Z]{2,}(?=\\1)");
        Matcher matcher = pattern.matcher(word);
        StringBuilder destinations = new StringBuilder();

        while(matcher.find()){
            if (!destinations.isEmpty()) {
                destinations.append(", ");
            }
            destinations.append(matcher.group());
            points += matcher.group().length();
        }
        System.out.println("Destinations: " + destinations.toString());
        System.out.println("Travel Points: " + points);
    }
}
