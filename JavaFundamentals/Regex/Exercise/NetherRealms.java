package FundamentalsModule.Regex.Exercise;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class NetherRealms {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String demonsDmgPattern = "((?:-|\\+|)\\d+(?:\\.*?\\d+)*)";
        Pattern regex = Pattern.compile(demonsDmgPattern);

        String[] demonsNames = console.nextLine().split(",");

        List<String> orderOfAppearance = new ArrayList<>();
        TreeMap<String, double[]> statsByDemon = new TreeMap<>();

        for (String demonName : demonsNames) {
            String currentDemon = demonName.trim();

            double dmg = 0;
            double hp = 0;

            Matcher matcher = regex.matcher(currentDemon);
            LinkedList<String> numbersAsString = new LinkedList<>();
            while (matcher.find()) {
                numbersAsString.add(matcher.group(0));
            }

            for (String num : numbersAsString) {
                dmg += Double.parseDouble(num);
            }

            for (int j = 0; j < currentDemon.length(); j++) {
                char c = currentDemon.charAt(j);
                if (c != '+' && c != '-' && c != '*' && c != '/' && c != '.' && !Character.isDigit(c)) {
                    hp += c;
                }
            }

            int multipliersCount = currentDemon.replaceAll("[^*]", "").length();
            int divisorsCount = currentDemon.replaceAll("[^/]", "").length();

            if (multipliersCount > divisorsCount) {
                for (int j = 0; j < multipliersCount - divisorsCount; j++) {
                    dmg *= 2;
                }
            } else {
                for (int j = 0; j < divisorsCount - multipliersCount; j++) {
                    dmg /= 2;
                }
            }

            statsByDemon.put(currentDemon, new double[]{hp, dmg});
            orderOfAppearance.add(currentDemon);
        }

        for (String demon : orderOfAppearance) {
            double[] value = statsByDemon.get(demon);
            int hp = (int) (value[0]);
            double dmg = value[1];

            System.out.format("%s - %d health, %.2f damage%n", demon, hp, dmg);
        }
    }
}