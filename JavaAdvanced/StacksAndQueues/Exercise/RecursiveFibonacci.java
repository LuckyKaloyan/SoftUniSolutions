package AdvancedModule.StacksAndQueues.Exercise;
import java.util.*;
public class RecursiveFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<Long> stack = new ArrayDeque<>();
        stack.push(Long.parseLong(String.valueOf(1)));
        stack.push(Long.parseLong(String.valueOf(1)));
        long input = Long.parseLong(scanner.nextLine());
        for(int i=1; i<input; i++){
            long secondnumber = stack.pop();
            long firstnumber = stack.peek();
            long thirdnumber = firstnumber+secondnumber;
            stack.push(secondnumber);
            stack.push(thirdnumber);
        }
        System.out.println(stack.peek());
    }
}