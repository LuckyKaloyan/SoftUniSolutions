package FundamentalsModule.Lists.Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> arrei = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).boxed().collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
        List<Integer> arrei2 = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).boxed().collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
        int biggerplayer = 0;
        int sum = 0;

        boolean endgame = true;
        while(endgame){

            if(arrei.isEmpty() || arrei2.isEmpty()){break;}
            if(arrei.get(0)>arrei2.get(0))
            {biggerplayer=1;}
            else if(arrei.get(0)<arrei2.get(0)) {biggerplayer = 2;}

            if(biggerplayer==1){arrei.add(arrei.get(0));
                arrei.add(arrei2.get(0));
                arrei.remove(0);
                arrei2.remove(0);
                if(arrei2.isEmpty()){endgame=true;}

            }
            else if(biggerplayer==2){arrei2.add(arrei2.get(0));
                arrei2.add(arrei.get(0));
                arrei.remove(0);
                arrei2.remove(0);
                if(arrei.isEmpty()){endgame=true;}

            }else{arrei.remove(0);
                arrei2.remove(0);
                if(arrei.isEmpty() || arrei2.isEmpty()){endgame=true;}}

            biggerplayer = 0;
        }
        if(!arrei.isEmpty()){for(int i = 0; i<arrei.size(); i++){
            sum=sum+arrei.get(i);
        }}
        else{for(int i=0; i<arrei2.size(); i++){
            sum=sum+arrei2.get(i);
        }}
        if(!arrei.isEmpty()){
            System.out.print("First player wins! Sum: ");System.out.print(sum);

        }else{
            System.out.print("Second player wins! Sum: ");   System.out.print(sum);

        }

    }



}
