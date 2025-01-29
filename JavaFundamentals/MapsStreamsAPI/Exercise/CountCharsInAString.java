package FundamentalsModule.MapsStreamsAPI.Exercise;

import java.util.*;

public class CountCharsInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String word = scanner.nextLine();

        List<String> letters = new ArrayList<>();

        for(int i=0; i<word.length(); i++){
            if(word.charAt(i)!=' '){
                letters.add(String.valueOf(word.charAt(i)));
            }
        }

        LinkedHashMap<String, Integer> counter = new LinkedHashMap<>();


        for (int i = 0; i < letters.size(); i++) {
            if (counter.containsKey(letters.get(i))) {
                Integer count = counter.get(letters.get(i));
                counter.put(letters.get(i), count + 1);
            } else {
                counter.put(letters.get(i), 1);
            }
        }

        for(Map.Entry<String, Integer> entry:counter.entrySet()){

            String keys = entry.getKey();
            Integer values = entry.getValue();
            System.out.println(keys+" -> "+values);
        }

    }
}
