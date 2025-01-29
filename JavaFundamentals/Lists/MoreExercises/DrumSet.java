package FundamentalsModule.Lists.MoreExercises;

import java.util.*;
import java.util.stream.Collectors;


public class DrumSet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double money = Double.parseDouble(scanner.nextLine());
        List<Double> numbers = new ArrayList<>(
                Arrays.stream(scanner.nextLine().split(" "))
                        .mapToDouble(Double::parseDouble)
                        .boxed()
                        .collect(Collectors.toList()));

        List<Double>base = new ArrayList<>(numbers);
        for(int i=0; i<numbers.size(); i++){
            base.set(i, numbers.get(i));
        }

        int alfa;

        String word = "";
        while(!word.equals("Hit it again, Gabsy!")){
            word  = scanner.nextLine();
            if(word.equals("Hit it again, Gabsy!")){break;}
            alfa = Integer.parseInt(word);

            for(int i=0; i<numbers.size(); i++){
                numbers.set(i, numbers.get(i)-alfa);

                if(numbers.get(i)<1){numbers.set(i, base.get(i) );
                    if(money>(base.get(i)*3)){ money=money-(base.get(i)*3);
                    } else{base.remove(i);
                        numbers.remove(i);
                        i--;}
                }
            }
        }
        for(int i=0; i<numbers.size(); i++){
            System.out.printf("%.0f ", numbers.get(i));
        }
        System.out.println();
        System.out.printf("Gabsy has %.2flv.", money    );
    }
}
