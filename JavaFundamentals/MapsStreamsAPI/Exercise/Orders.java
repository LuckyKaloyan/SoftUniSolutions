package FundamentalsModule.MapsStreamsAPI.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = "";

        LinkedHashMap<String, Double> map = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> quanitity = new LinkedHashMap<>();
        while(!word.equals("buy")){
            word = scanner.nextLine();
            if(word.equals("buy")){
                break;
            }
            String[] object = word.split(" ");



            if(map.containsKey(object[0])){
                Double value = map.get(object[0]);
                map.put(object[0],Double.parseDouble(object[1]));

                Integer  kiufte = quanitity.get(object[0]);
                quanitity.put(object[0],kiufte+Integer.parseInt(object[2]));



            }else{
                map.put(object[0],Double.parseDouble(object[1]));
                quanitity.put(object[0],Integer.parseInt(object[2]));
            }
        }

        for(Map.Entry<String, Double> entry: map.entrySet()){
            System.out.printf("%s -> %.02f",entry.getKey(),entry.getValue()*quanitity.get(entry.getKey()));
            System.out.println();
        }


    }
}
