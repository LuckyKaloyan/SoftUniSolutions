package FundamentalsModule.Lists.Lab;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GaussTrick {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Double> numbers = new ArrayList<>(Arrays.stream(scanner.nextLine().split(" ")).map(Double::parseDouble).collect(Collectors.toList()));


        DecimalFormat decimalFormat = new DecimalFormat("0.##");

        if(numbers.size()%2==1){
            for(int i=0; i<=numbers.size()/2-1; i++){
                numbers.set(i, numbers.get(i)+numbers.get(numbers.size()-1));
                numbers.remove(numbers.size()-1);
            }
        }else{
            for(int i=0; i<=numbers.size()/2; i++){
                numbers.set(i, numbers.get(i)+numbers.get(numbers.size()-1));
                numbers.remove(numbers.size()-1);
            }
        }


        for (int i=0; i<numbers.size(); i++){
            System.out.print(decimalFormat.format(numbers.get(i)));System.out.print(" ");

        }



    }
}
