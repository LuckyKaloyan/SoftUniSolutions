package FundamentalsModule.Lists.Exercise;

import java.util.*;
public class BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> arrei = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).boxed().collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
        List<Integer> arrei2 = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).boxed().collect(ArrayList::new, ArrayList::add, ArrayList::addAll);

        int power = arrei2.get(1);
        int specialnumber = arrei2.get(0);
        int sum = 0;

        for(int j=0; j<arrei.size(); j++){
            if(arrei.get(j)==specialnumber){

                for(int i=0; i<power; i++){
                    try{arrei.remove(j+1);}catch(Exception e){}
                    try{arrei.remove(j-1); j--;}catch(Exception c){}

                }
                arrei.remove(j);j--;
            }
        }
        for(int i =0; i<arrei.size(); i++){
            sum=sum+arrei.get(i);
        }
        System.out.println(sum);






    }
}
