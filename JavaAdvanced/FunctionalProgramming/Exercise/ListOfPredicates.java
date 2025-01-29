package AdvancedModule.FunctionalProgramming.Exercise;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ListOfPredicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Integer> listche = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).boxed().
                collect(Collectors.toList());

        BiFunction<Integer, List<Integer>, List<Integer>> bifunction = (number, list) -> {

            List<Predicate<Integer>> wtf = new ArrayList<>();
            for(int i:list){
                Predicate<Integer> predicate = p -> p%i==0;
                wtf.add(predicate);
            }

            List<Integer> results = new ArrayList<>();

            for(int i=1; i<=number; i++){
                boolean check = true;
                for(Predicate<Integer> pp:wtf){
                    if(!pp.test(i)){
                        check = false;
                        break;
                    }
                }
                if(check){
                    results.add(i);
                }
            }
            return results;
        };
        for(int i:bifunction.apply(n,listche)){
            System.out.print(i+" ");
        }
    }
}