package FundamentalsModule.MidExamPreparation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class Inventory {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] initials = scanner.nextLine().split(", ");
        String word = "";

        List<String> listche = new ArrayList<>(Arrays.asList(initials));

        while(!word.equals("Craft!")){
            word = scanner.nextLine();
            if(word.equals("Craft!")){
                break;
            }

            String[] splitted = word.split(" - ");
            String command = splitted[0];
            String object = splitted[1];

            if(command.equals("Drop")){
                try{listche.remove(object);}catch(Exception ignored){}
            }
            if(command.equals("Combine Items")){
                String[] spliitedcombine = object.split(":");
                String wordone = spliitedcombine[0];
                String wordtwo = spliitedcombine[1];
                if(listche.contains(wordone)){
                    for(int i=0; i< listche.size(); i++){
                        if(listche.get(i).equals(wordone)){
                            listche.add(i+1,wordtwo);
                        }
                    }
                }
            }

            if(command.equals("Renew")){
                if(listche.contains(object)){
                    listche.remove(object);
                    listche.add(object);
                }}
            if(command.equals("Collect")){
                if(!listche.contains(object)){
                    listche.add(object);
                }
            }
        }
        if(listche.size()>0){
            System.out.print(listche.get(0));
            if(listche.size()>1){
                for(int i=1; i<listche.size(); i++){
                    System.out.print(", "+listche.get(i));
                }
            }
        }



    }
}
