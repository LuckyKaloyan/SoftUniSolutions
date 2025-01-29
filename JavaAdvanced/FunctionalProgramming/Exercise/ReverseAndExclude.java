package AdvancedModule.FunctionalProgramming.Exercise;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ReverseAndExclude {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).boxed().collect(Collectors.toList());
        int filter = Integer.parseInt(scanner.nextLine());
        
       List<Integer> numbersfiltered = numbers.stream().filter(s->s%filter!=0).collect(Collectors.toList());
        Collections.reverse(numbersfiltered);

        for(int i:numbersfiltered){
            System.out.print(i+" ");
        }




    }
}
