package AdvancedModule.SetsAndMaps.Lab;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.stream.Collectors;

public class VoinaGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> firstdeck = Arrays.stream(scanner.nextLine().split("\\s+"))
                        .mapToInt(Integer::parseInt)
                        .boxed()
                        .collect(Collectors.toCollection(LinkedHashSet::new));
        Set<Integer> seconddeck = Arrays.stream(scanner.nextLine().split("\\s+"))
                        .mapToInt(Integer::parseInt)
                        .boxed()
                        .collect(Collectors.toCollection(LinkedHashSet::new));
for(int i=0; i<50; i++){
    int firstDeckTopNumber = firstdeck.iterator().next();
    firstdeck.remove(firstDeckTopNumber);
    int secondDeckTopNumber = seconddeck.iterator().next();
    seconddeck.remove(secondDeckTopNumber);
    if(firstDeckTopNumber>secondDeckTopNumber){
        firstdeck.add(firstDeckTopNumber);
        firstdeck.add(secondDeckTopNumber);
    }else if(secondDeckTopNumber>firstDeckTopNumber){
        seconddeck.add(firstDeckTopNumber);
        seconddeck.add(secondDeckTopNumber);
    }
    if(seconddeck.isEmpty() || firstdeck.isEmpty()){
        if(firstdeck.isEmpty()){
            System.out.println("Second player win!");
        }else{
            System.out.println("First player win!");
        }
        break;
    }
}
        if(firstdeck.size()==seconddeck.size()){
            System.out.println("Draw!");
        }else if(firstdeck.size()> seconddeck.size()){
            System.out.println("First player win!");
        }else{
            System.out.println("Second player win!");
        }
    }
}