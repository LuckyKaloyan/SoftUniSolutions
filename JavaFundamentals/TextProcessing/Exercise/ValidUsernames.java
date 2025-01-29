package FundamentalsModule.TextProcessing.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputArray = scanner.nextLine().split(", ");
        List<String> list = Arrays.asList(inputArray);
        String regex = "^[A-Za-z_-]+$";
        Pattern pattern = Pattern.compile(regex);
        for(String person:list){
            Matcher matcher = pattern.matcher(person);
            if(matcher.find()){
                if(person.length()>=3 && person.length()<=16){
                    System.out.println(person);
                }
            }
        }
    }
}
