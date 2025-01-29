package FundamentalsModule.Regex.MoreExercises;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WinningTicket {
    public static void main(String[] args) {
        String input = "$$$$$$Ca$$$$$$Cashsh, lkjhgh, @@@@@@ppppoooo@@@@@@";

        String[] arr = input.replaceAll("\\s+", "").split(",");
        Pattern pattern = Pattern.compile("(\\@{6,10}|\\${6,10}|\\^{6,10}|\\#{6,10})");

        for (String reg : arr) {
            if (reg.length() != 20) {
                System.out.println("invalid ticket");
            } else {
                String left = reg.substring(0, reg.length() / 2);
                String right = reg.substring(reg.length() / 2);

                Matcher leftMatcher = pattern.matcher(left);
                Matcher rightMatcher = pattern.matcher(right);

                if (!leftMatcher.find() || !rightMatcher.find()) {
                    System.out.println("ticket \"" + reg + "\" - no match");
                } else {
                    String leftMatch = leftMatcher.group();
                    String rightMatch = rightMatcher.group();

                    if (leftMatch.length() == 10 && rightMatch.length() == 10) {
                        System.out.println("ticket \"" + reg + "\" - " + leftMatch.length() + leftMatch.charAt(0) + " Jackpot!");
                    } else if (rightMatch.charAt(0) == leftMatch.charAt(0)) {
                        if (leftMatch.length() < rightMatch.length()) {
                            System.out.println("ticket \"" + reg + "\" - " + leftMatch.length() + leftMatch.charAt(0));
                        }
                        if (rightMatch.length() < leftMatch.length()) {
                            System.out.println("ticket \"" + reg + "\" - " + rightMatch.length() + rightMatch.charAt(0));
                        }
                        if (rightMatch.length() == leftMatch.length()) {
                            System.out.println("ticket \"" + reg + "\" - " + leftMatch.length() + leftMatch.charAt(0));
                        }
                    } else {
                        System.out.println("invalid ticket");
                    }
                }
            }
        }
    }
}
