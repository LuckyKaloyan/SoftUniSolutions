package FundamentalsModule.FinalExamPreparation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmojiDetector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String digitRegex = "\\d";

        Pattern digitPattern = Pattern.compile(digitRegex);
        Matcher digitMatcher = digitPattern.matcher(input);

        int sum = 1;
        while (digitMatcher.find()) {
            int digit = Integer.parseInt(digitMatcher.group());
            sum *= digit;
        }

        String emojiRegex = "([:|*])\\1([A-Z][a-z]{2,})\\1\\1";
        Pattern emojiPattern = Pattern.compile(emojiRegex);
        Matcher emojiMatcher = emojiPattern.matcher(input);

        List<String> emojiList = new ArrayList<>();
        List<String> allEmojis = new ArrayList<>();

        while (emojiMatcher.find()) {
            String emoji = emojiMatcher.group();

            int sumChar = 0;
            for (int i = 2; i < emoji.length() - 2; i++) {
                char sign = emoji.charAt(i);
                sumChar += sign;
            }
            allEmojis.add(emoji);

            if (sumChar > sum) {
                emojiList.add(emoji);
            }
        }

        System.out.printf("Cool threshold: %d%n", sum);
        System.out.printf("%d emojis found in the text. The cool ones are:%n", allEmojis.size());

        for (String coolEmoji : emojiList) {
            System.out.printf("%s%n", coolEmoji);
        }
    }
}
