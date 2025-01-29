package FundamentalsModule.TextProcessing.MoreExercises;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TreasureFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int position = 0;

        String word = "";
        while(!word.equals("find")){
            word = scanner.nextLine();
            if(word.equals("find")){
                scanner.close();
                break;}
            String word2 = "";
            position = 0;
            for(int i=0; i<word.length(); i++){
                word2 = word2 +String.valueOf((char)(word.charAt(i)-numbers[position]));
                position++;
                if(position==numbers.length){position=0;}

            }
            String[] almostfinish = word2.split("&");
            String regex = "<([a-zA-Z0-9]+)>";
            String password = almostfinish[almostfinish.length - 1];
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(password);



            System.out.printf("Found %s at ",almostfinish[1]);

            if(matcher.find()){
                String coordinates = matcher.group().substring(1,matcher.group().length()-1);
                System.out.println(coordinates);
            }



        }






    }
}
