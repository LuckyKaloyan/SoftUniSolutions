package AdvancedModule.StacksAndQueues.Exercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class ReversedNumbersWithAStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] arrei = scanner.nextLine().split(" ");
        ArrayDeque<String> stack = new ArrayDeque<>();

        for(int i=0; i<arrei.length; i++){
            stack.push(arrei[i]);
        }
        for(int i=0; i<arrei.length; i++){
            System.out.print(stack.pop()+" ");
        }


    }
}