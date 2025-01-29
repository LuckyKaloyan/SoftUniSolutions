package AdvancedModule.FunctionalProgramming.Exercise;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class FindTheSmallestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       int[] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Function<int[],Integer> function = s -> {
            int max = Integer.MAX_VALUE;
            int index = 0;
            for(int i=0; i<s.length; i++){
                if(s[i]<=max){
                    max = s[i];
                    index = i;
                }
            }
            return index;
        };
        System.out.println(function.apply(arr));
    }
}
