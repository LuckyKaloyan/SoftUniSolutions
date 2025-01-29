package FundamentalsModule.Lists.Lab;

import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.stream.Collectors;


public class SumOfAdjacents {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> numbers = new ArrayList<>(Arrays.stream(scanner.nextLine().split(" ")).map(Double::parseDouble).collect(Collectors.toList()));

        for(int l=0; l<20; l++){
            for(int i=0; i<numbers.size()-1; i++){
                if(numbers.get(i).equals(numbers.get(i+1))){
                    numbers.set(i, numbers.get(i+1)*2);
                    numbers.remove(i+1);}
            }
        }

        DecimalFormat decimalFormat = new DecimalFormat("0.##");
        for(int j=0; j<numbers.size(); j++){
            System.out.print(decimalFormat.format(numbers.get(j))); System.out.print(" ");
        }
    }
}
