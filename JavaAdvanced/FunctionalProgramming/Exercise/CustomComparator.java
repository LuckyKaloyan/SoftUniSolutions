package AdvancedModule.FunctionalProgramming.Exercise;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CustomComparator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> listche = Arrays.stream(scanner.nextLine()
                .split(" "))
                .mapToInt(Integer::parseInt).boxed()
                .collect(Collectors.toList());
            Function<List<Integer>, List<Integer>> function = list -> {
                List<Integer> newlist = new ArrayList<>();
                List<Integer> secondnewlist = new ArrayList<>();
                for (Integer value : list) {
                    if (value % 2 == 0) {
                        newlist.add(value);
                    }
                }
                for (Integer integer : list) {
                    if (integer % 2 == 1 || integer%2==-1) {
                        secondnewlist.add(integer);
                    }
                }
                Collections.sort(newlist);
                Collections.sort(secondnewlist);
                newlist.addAll(secondnewlist);



                return newlist;
            };

        for(int i:function.apply(listche)){
            System.out.print(i+" ");
        }
    }
}