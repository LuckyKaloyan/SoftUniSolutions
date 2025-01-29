package FundamentalsModule.MapsStreamsAPI.Exercise;

import java.util.*;

public class Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, List<String>> map = new LinkedHashMap<>();

        String word = "";

        while(!word.equals("end")){
            word = scanner.nextLine();
            if(word.equals("end")){break;}

            String[]arrei = word.split(" : ");

            if(map.containsKey(arrei[0])){

                List<String> list = map.get(arrei[0]);
                list.add(arrei[1]);
                map.put(arrei[0],list);
            }else{

                List<String> listone = new ArrayList<>();
                listone.add(arrei[1]);
                map.put(arrei[0], listone);
            }
        }
        for(Map.Entry<String, List<String>> entry:map.entrySet()){
            System.out.println(entry.getKey() + ": "+entry.getValue().size());
            for(int i=0; i<entry.getValue().size(); i++){
                System.out.println("-- "+entry.getValue().get(i));
            }

        }
    }
}
