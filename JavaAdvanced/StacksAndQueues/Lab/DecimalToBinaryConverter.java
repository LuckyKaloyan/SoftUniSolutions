package AdvancedModule.StacksAndQueues.Lab;

import java.util.ArrayDeque;
import java.util.Scanner;
public class DecimalToBinaryConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer> stack = new ArrayDeque<>();


        if(input==0){
            System.out.println(0);
        }else {
            while (input >= 1) {
                stack.push(input % 2);
                input = input / 2;
            }
            int i = stack.size();
            for (int j = 0; j < i; j++) {
                System.out.print(stack.pop());
            }
        }






    }
}
