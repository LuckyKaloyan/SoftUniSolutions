package FundamentalsModule.FinalExamPreparation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdAstra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regex = "(#[A-Za-z\\s]*#\\d{2}/\\d{2}/\\d{2}#\\d+#|" +
                "\\|[A-Za-z\\s]*\\|\\d{2}/\\d{2}/\\d{2}\\|\\d+\\|)";
        Pattern pattern = Pattern.compile(regex);
        int total = 0;
        String word = scanner.nextLine();
        Matcher matcher = pattern.matcher(word);
        List<String> listche = new ArrayList<>();
        while(matcher.find()){
            listche.add(matcher.group());
        }


        if(listche.size()>0) {
            for (int i = 0; i < listche.size(); i++) {
                if (listche.get(i).charAt(0) == '#') {
                    String[] splitted = listche.get(i).split("#");
                    total = total + Integer.parseInt(splitted[3]);
                } else {
                    String[] splitted = listche.get(i).split("\\|");
                    total = total + Integer.parseInt(splitted[3]);
                }
            }
        }
        System.out.println("You have food to last you for: "+total/2000+" days!");
        if(listche.size()>0) {
            for (int i = 0; i < listche.size(); i++) {
                if (listche.get(i).charAt(0) == '#') {
                    String[] splitted = listche.get(i).split("#");
                    System.out.printf("Item: %s, Best before: %s, Nutrition: %s", splitted[1], splitted[2], splitted[3]);
                    System.out.println();
                } else {
                    String[] splitted = listche.get(i).split("\\|");
                    System.out.printf("Item: %s, Best before: %s, Nutrition: %s", splitted[1], splitted[2], splitted[3]);
                    System.out.println();
                }
            }
        }
    }
}
