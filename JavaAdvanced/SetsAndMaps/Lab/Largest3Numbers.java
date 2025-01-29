package AdvancedModule.SetsAndMaps.Lab;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Largest3Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> listche = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        try{System.out.print(listche.get(0));}catch (Exception ignored){}
        try{System.out.print(" "+listche.get(1));}catch (Exception ignored){}
        try{System.out.print(" "+listche.get(2));}catch (Exception ignored){}
    }
}