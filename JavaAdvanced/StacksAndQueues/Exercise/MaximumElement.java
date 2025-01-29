package AdvancedModule.StacksAndQueues.Exercise;
import java.util.ArrayDeque;
import java.util.Scanner;
public class MaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int times = Integer.parseInt(scanner.nextLine());

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int max = Integer.MIN_VALUE;
        for(int i=0; i<times; i++){
            String[] splittedcommand = scanner.nextLine().split(" ");
            if(splittedcommand.length>1){
                stack.push(Integer.parseInt(splittedcommand[1]));

            }else if(splittedcommand[0].equals("2")){
                stack.pop();
            }
            else{
                for(int num:stack){
                    if(num>max){
                        max=num;
                    }
                }
                System.out.println(max);
                max=Integer.MIN_VALUE;
            }
        }
    }
}