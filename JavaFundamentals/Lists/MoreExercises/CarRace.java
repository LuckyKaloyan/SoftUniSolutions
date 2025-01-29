package FundamentalsModule.Lists.MoreExercises;

import java.util.*;
import java.util.stream.Collectors;

public class CarRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        ArrayList<Double> arrei = new ArrayList<>(Arrays.stream(scanner.nextLine().split(" ")).mapToDouble(Double::parseDouble).boxed().collect(Collectors.toList()));

        double firsttotal = 0;
        double secondtotal = 0;

        for(int i=0; i<arrei.size()/2; i++){
            firsttotal=firsttotal+arrei.get(i);
            if(arrei.get(i)==0){firsttotal=firsttotal*0.8;}
            secondtotal=secondtotal+arrei.get(arrei.size()-1-i);
            if(arrei.get(arrei.size()-1-i)==0){secondtotal=secondtotal*0.8;}
        }



        if(firsttotal>secondtotal){
            System.out.printf("The winner is right with total time: %1.1f", Math.min(firsttotal, secondtotal));
        }else{System.out.printf("The winner is left with total time: %1.1f", Math.min(firsttotal, secondtotal));}






    }
}
