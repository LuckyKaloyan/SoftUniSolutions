package FundamentalsModule.Lists.Lab;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> numbers = new ArrayList<>(Arrays.stream(scanner.nextLine().split(" ")).map(Double::parseDouble).collect(Collectors.toList()));

        List<Double> numbers2 = new ArrayList<>(Arrays.stream(scanner.nextLine().split(" ")).map(Double::parseDouble).collect(Collectors.toList()));

        List<Double>numbersresult = new ArrayList<>(numbers.size()+numbers2.size());

        int lower = Math.min(numbers.size(), numbers2.size());

        for(int i=0; i<lower; i++){
            numbersresult.set(i*2, numbers.get(i));
            numbersresult.set(i*2+1, numbers2.get(i));
        }


        int kopyr = Math.abs(numbers.size()-numbers2.size());

        if(numbers.size()<numbers2.size()){
            for(int k =0; k<kopyr; k++){
                numbersresult.add(numbers2.get(numbers.size()+k));
            }
        }

        DecimalFormat decimalFormat = new DecimalFormat("0.##");

        for (int o = 0; o < numbersresult.size(); o++) {
            System.out.print(decimalFormat.format(numbersresult.get(o)) + " ");
        }




    }
}
