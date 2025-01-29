package FundamentalsModule.MapsStreamsAPI.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
public class AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = "";
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        while(!word.equals("stop")){
            word = scanner.nextLine();

            if(word.equals("stop")){break;}
            int value = Integer.parseInt(scanner.nextLine());

            if(map.containsKey(word)){
                Integer values = map.get(word);
                map.put(word,value+values);
            }else{map.put(word, value);}


        }
        for(Map.Entry<String, Integer> entry: map.entrySet()){
            System.out.println(entry.getKey()+" -> "+entry.getValue());
        }





    }
}
