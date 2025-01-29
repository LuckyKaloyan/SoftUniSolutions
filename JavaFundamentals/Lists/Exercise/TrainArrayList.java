package FundamentalsModule.Lists.Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TrainArrayList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> input = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).boxed().collect(ArrayList::new, ArrayList::add, ArrayList::addAll);

        int max = Integer.parseInt(scanner.nextLine());

        boolean isittrue = false;
        String word;

        while(!isittrue){
            word = scanner.nextLine();
            if(word.equals("end")){isittrue=true;
                break;}
            if(word.charAt(0)=='A' && word.charAt(1)=='d' && word.charAt(2)=='d'){
                input.add(Integer.parseInt(word.substring(4,word.length())));
            }else for(int i=0; i<=input.size()-1; i++){
                if(input.get(i)+Integer.parseInt(word)<=max){
                    input.set(i, input.get(i)+Integer.parseInt(word));
                    break;
                }
            }
        }
        for (int i =0; i<input.size(); i++){
            System.out.print(input.get(i)+" ");
        }
    }
}
