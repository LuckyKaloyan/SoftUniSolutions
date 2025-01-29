package FundamentalsModule.Lists.Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer>input = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).boxed().collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
        boolean isittrue = false;
        String word = "";
        int ko;
        int fal;
        while(!isittrue){
            word = scanner.next();
            if(word.equals("end")){isittrue=true;
                break;}
            if(word.equals("Delete")){ko= scanner.nextInt();

                for(int g=0; g<input.size(); g++){

                    if(input.get(g)==ko){input.remove(g);}}


            }
            if(word.equals("Insert")){ko = scanner.nextInt();
                fal = scanner.nextInt();

                input.add(fal, ko);
            }

        }
        for(int i=0; i<input.size(); i++){
            System.out.print(input.get(i)+" ");}




    }
}
