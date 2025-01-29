package AdvancedModule.FunctionalProgramming.Lab;
import java.util.*;
import java.util.stream.Collectors;


public class SortEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      List<Integer> listche = new ArrayList<Integer>(Arrays.stream(scanner.nextLine().split(", "))
              .mapToInt(Integer::parseInt)
              .boxed()
              .filter(e -> e%2==0).collect(Collectors.toList()));
              for(int i=0; i<listche.size()-1; i++){
                  System.out.print(listche.get(i)+", ");
              }System.out.println(listche.get(listche.size()-1));
              Collections.sort(listche);
        for(int i=0; i<listche.size()-1; i++){
            System.out.print(listche.get(i)+", ");
        }
        System.out.println(listche.get(listche.size()-1));
    }
}
