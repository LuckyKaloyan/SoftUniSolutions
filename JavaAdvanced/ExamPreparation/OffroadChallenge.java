package AdvancedModule.ExamPreparation;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class OffroadChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] initialFuel = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] additionalConsumption = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] fuelNeeded = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int altitude = 0;
        int calculatedValue;
        ArrayDeque<Integer> neededQueue = new ArrayDeque<>();
        ArrayDeque<Integer> additionalQueue = new ArrayDeque<>();
        ArrayDeque<Integer> initialStack = new ArrayDeque<>();
        for(int i=0; i<initialFuel.length; i++){
            neededQueue.add(fuelNeeded[i]);
            additionalQueue.add(additionalConsumption[i]);
            initialStack.push(initialFuel[i]);
        }
        while(!neededQueue.isEmpty() && !additionalQueue.isEmpty() && !initialStack.isEmpty()){
               int neededValue = neededQueue.poll();
              int  additionalValue = additionalQueue.poll();
               int initialValue = initialStack.pop();
            calculatedValue=initialValue-additionalValue;
            if(calculatedValue<=0){break;}
            if(calculatedValue>=neededValue){
                altitude++;
            }else{break;}
        }
      if(altitude==0){
          System.out.println("John did not reach: Altitude 1");
          System.out.println("John failed to reach the top.");
          System.out.println("John didn't reach any altitude.");
      }else{
        if(altitude>0) {
            for (int i = 1; i <= altitude; i++) {
                System.out.println("John has reached: Altitude " + i);
            }
        }
        if(altitude<4){
            System.out.println("John did not reach: Altitude "+(altitude+1));
            System.out.println("John failed to reach the top.");
            System.out.print("Reached altitudes: ");
            for(int i=1; i<=altitude; i++){
                System.out.print("Altitude "+i);
                if(i<=altitude-1){
                    System.out.print(", ");
                }
            }
        }else{
            System.out.println("John has reached all the altitudes and managed to reach the top!");
        }
       }
    }
}