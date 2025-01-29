package AdvancedModule.StacksAndQueues.Lab;

import java.util.ArrayDeque;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        String input = scanner.nextLine();

        String regex = "[+-][ ][0-9]+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        String regex2 = "[-]?[0-9]+";
        Pattern patter = Pattern.compile(regex2);
        Matcher matcher2 = patter.matcher(input);

        if(matcher2.find()){
            stack.push(Integer.parseInt(matcher2.group()));
        }
        while(matcher.find()){
            if(matcher.group().charAt(0)=='-'){
                String kiufte = matcher.group().substring(2);
                stack.push(Integer.parseInt(kiufte)*(-1));
            }else{
                stack.push(Integer.parseInt(matcher.group().substring(2)));
            }}
        int result = 0;

        int length = stack.size();
        for(int i=0; i<=length-1; i++){
            result = result+stack.pop();

        }
        System.out.println(result  );











    }
}
