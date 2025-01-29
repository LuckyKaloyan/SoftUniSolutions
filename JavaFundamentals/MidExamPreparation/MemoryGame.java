package FundamentalsModule.MidExamPreparation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MemoryGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String elements = scanner.nextLine();
        String[] array = elements.split(" ");
        List<String> list = new ArrayList<>();
        int moves = 0;
        char a;
        char b;

        Collections.addAll(list, array);
        int test;
        int test2;


        String word = "";

        while(!word.equals("end")){
            word = scanner.nextLine();
            if(word.equals("end")){break;}
            moves++;
            String[] indexes = word.split(" ");
            a = indexes[0].charAt(0);
            b = indexes[1].charAt(0);

            if(Character.isDigit(a) && Character.isDigit(b) && Integer.parseInt(indexes[0])>=0 && Integer.parseInt(indexes[1])>=0){
                if(list.get(Integer.parseInt(indexes[0])).equals(list.get(Integer.parseInt(indexes[1])))){
                    if(Integer.parseInt(indexes[1])>Integer.parseInt(indexes[0])){
                        System.out.println("Congrats! You have found matching elements - "+(list.get(Integer.parseInt(indexes[0])))+"!");

                        list.remove(Integer.parseInt(indexes[1]));
                        list.remove(Integer.parseInt(indexes[0]));

                    }else{
                        System.out.println("Congrats! You have found matching elements - "+(list.get(Integer.parseInt(indexes[0])))+"!");
                        list.remove(Integer.parseInt(indexes[0]));
                        list.remove(Integer.parseInt(indexes[1]));

                    }
                }else{
                    System.out.println("Try again!");
                }
            }else if(!Character.isDigit(a) || !Character.isDigit(b) || indexes[0].equals(indexes[1])){
                System.out.println("Invalid input! Adding additional elements to the board");
                list.add((list.size()/2),"-"+moves+"a");
                list.add((list.size()/2),"-"+moves+"a");
            }

            if(list.size()<1){
                System.out.println("You have won in "+moves+" turns!");
                break;
            }


        }

        if(list.size()>=1){
            System.out.println("Sorry you lose :(");
            for(int i=0; i<list.size(); i++){
                System.out.print(list.get(i)+" ");
            }
        }











    }
}
