package FundamentalsModule.Lists.Lab;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveNegativeAndReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Integer> numbers = new ArrayList<>(Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList()));


        Collections.reverse(numbers);
        boolean allnegative = true;
        for(int i=0; i<numbers.size(); i++){
            if(numbers.get(i)>=0){allnegative=false;
                break;}}

        if(!allnegative){
            for(int i=0; i<numbers.size(); i++){
                if(numbers.get(i)>=0){
                    System.out.print(numbers.get(i)+" ");
                }
            }
            ;
        }else { System.out.println("empty");}








    }
}
