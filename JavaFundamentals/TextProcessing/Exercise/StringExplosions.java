package FundamentalsModule.TextProcessing.Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringExplosions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        List<String> list = new ArrayList<>();
        int power = 0;

        for (int i = 0; i < word.length(); i++) {
            list.add(String.valueOf(word.charAt(i)));
        }


        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(">")) {
                power = power+ Character.getNumericValue(list.get(i + 1).charAt(0));
                int j = i + 1;
                while (j < list.size() && power > 0) {
                    if (list.get(j).equals(">")) {
                        break;
                    }
                    list.remove(j);
                    power--;
                }
            }
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
        }
    }
}
