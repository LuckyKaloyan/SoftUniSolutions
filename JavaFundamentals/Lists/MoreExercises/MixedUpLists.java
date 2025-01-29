package FundamentalsModule.Lists.MoreExercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MixedUpLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> firstline = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).boxed().collect(Collectors.toCollection(ArrayList::new));
        ArrayList<Integer> secondline = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).boxed().collect(Collectors.toCollection(ArrayList::new));
        ArrayList<Integer> thirdline = new ArrayList<>();
        ArrayList<Integer> unitednations = new ArrayList<>();
        ArrayList<Integer> resultednations = new ArrayList<>();

        if(secondline.size()>firstline.size()){
            thirdline.add(secondline.get(0));
            thirdline.add(secondline.get(1));
            secondline.remove(0);
            secondline.remove(0);

        }
        else{
            thirdline.add(firstline.get(secondline.size()));
            thirdline.add(firstline.get(secondline.size()+1));
            firstline.remove(secondline.size());
            firstline.remove(secondline.size());

        }

        if(thirdline.get(0)>thirdline.get(1)){thirdline.add(thirdline.get(0));
            thirdline.remove(0);}

        for(int i=0; i<firstline.size(); i++){
            unitednations.add(firstline.get(i));
            unitednations.add(secondline.get(firstline.size()-1-i));
        }


        for(int i=0; i<unitednations.size(); i++){
            if(unitednations.get(i)>thirdline.get(0) && unitednations.get(i)<thirdline.get(1)){
                resultednations.add(unitednations.get(i));
            }
        }
        Collections.sort(resultednations);
        for(int i=0; i<resultednations.size(); i++){
            System.out.print(resultednations.get(i)+ " ");
        }
    }
}
