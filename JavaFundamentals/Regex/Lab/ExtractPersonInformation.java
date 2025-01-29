package FundamentalsModule.Regex.Lab;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractPersonInformation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int times = Integer.parseInt(scanner.nextLine());

        String namePattern = "@([A-Za-z]+)";
        String agePattern = "#(\\d+)";
        Pattern nameRegex = Pattern.compile(namePattern);
        Pattern ageRegex = Pattern.compile(agePattern);

        for (int i = 0; i < times; i++) {
            String line = scanner.nextLine();

            Matcher nameMatcher = nameRegex.matcher(line);
            Matcher ageMatcher = ageRegex.matcher(line);

            String name = "";
            String age = "";

            if (nameMatcher.find()) {
                name = nameMatcher.group(1);
            }

            if (ageMatcher.find()) {
                age = ageMatcher.group(1);
            }

            if (!name.isEmpty() && !age.isEmpty()) {
                System.out.println(name + " is " + age + " years old.");
            }
        }
    }
}
