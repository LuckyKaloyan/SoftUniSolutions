package AdvancedModule.StacksAndQueues.Exercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> queue = new ArrayDeque<>();

        String[] commands = scanner.nextLine().split(" ");
        String[] stackvalues = scanner.nextLine().split(" ");

        for(int i=0; i<stackvalues.length; i++){
            queue.offer(Integer.parseInt(stackvalues[i]));}
        for(int i=0; i<Integer.parseInt(commands[1]); i++){
            queue.poll();}
        if(queue.isEmpty()){
            System.out.println(0);
        }else if(queue.contains(Integer.parseInt(commands[2]))){
            System.out.println(true);
        }else{
            int smallest = Integer.MAX_VALUE;
            for(int kep:queue){
                if(kep<smallest){
                    smallest=kep;
                }}
            System.out.println(smallest);
        }
    }
}