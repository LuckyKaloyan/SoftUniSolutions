package AdvancedModule.StacksAndQueues.Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class MatchingBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> kiufte = new ArrayDeque<>();
        String input = scanner.nextLine();

        for(int i=0; input.length()>i; i++){
            if(input.charAt(i)=='('){
                kiufte.push(i);
            }else if(input.charAt(i)==')'){
                System.out.println(input.substring(kiufte.pop(),i+1));
            }

        }



    }
}
