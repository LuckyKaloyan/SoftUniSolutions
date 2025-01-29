package FundamentalsModule.MapsStreamsAPI.Lab;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class OddOccurances {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] arrei = scanner.nextLine().split(" ");

        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();

        for(String word:arrei){
            String wordlowercase = word.toLowerCase();
            if(map.containsKey(wordlowercase)){
                map.put(wordlowercase, map.get(wordlowercase)+1);
            }else{
                map.put(wordlowercase, 1);
            }
        }
        int count = 0;

        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();

        for(Map.Entry<String, Integer> entry:entrySet){
            String key = entry.getKey();
            Integer value = entry.getValue();

            if(value%2==1){
                count++;
                if(count==1){
                    System.out.print(key);
                }else{System.out.print(", "+key);}

            }
        }


    }
}
