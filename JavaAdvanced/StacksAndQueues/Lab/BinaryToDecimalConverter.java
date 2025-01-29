package AdvancedModule.StacksAndQueues.Lab;

import java.util.ArrayDeque;
import java.util.Scanner;
public class BinaryToDecimalConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        ArrayDeque<Integer> stack = new ArrayDeque<>();


        int j = -1;
        for(int i=input.length(); i>0; i--){
            j++;
            int c = 1;
            for(int k=0; k<i; k++){
                c=c*2;
            }
            stack.push(Integer.parseInt(String.valueOf(input.charAt(j)))*c/2);
        }
        int o = stack.size();
        int result = 0;
        for(int i=0; i<o; i++){
            result = result+stack.pop();
        }

        System.out.println(result);




    }
}
