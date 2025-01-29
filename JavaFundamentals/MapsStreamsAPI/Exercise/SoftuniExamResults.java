package FundamentalsModule.MapsStreamsAPI.Exercise;

import java.util.*;

public class SoftuniExamResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashMap<String, List<Integer>> map = new LinkedHashMap<>();
        LinkedHashMap<String,Integer> subcount = new LinkedHashMap<>();
        String input;


        while(true){
            input = scanner.nextLine();
            if(input.equals("exam finished")){break;}
            String[] words = input.split("-");

            if(words.length==3){
                if(subcount.containsKey(words[1])){
                    subcount.put(words[1],subcount.get(words[1])+1);
                }else{subcount.put(words[1],1);}
            }

            if(words.length==2){
                if(words[1].equals("banned")){
                    map.remove(words[0]);
                }

            }else{
                if(map.containsKey(words[0])){
                    if(Integer.parseInt(words[2])>map.get(words[0]).get(0)){
                        List<Integer> blanklist;
                        blanklist = map.get(words[0]);
                        blanklist.add(0,Integer.parseInt(words[2]));
                        map.put(words[0],blanklist);
                    }
                    map.get(words[0]).add(Integer.parseInt(words[2]));


                }else{
                    List<Integer> listche = new ArrayList<>();
                    listche.add(Integer.parseInt(words[2]));
                    map.put(words[0],listche);}
            }
        }
        if(map.size()>0){
            System.out.println("Results:");
        }
        for(Map.Entry<String, List<Integer>> entry : map.entrySet()){
            System.out.println(entry.getKey() + " | "+entry.getValue().get(0));
        }
        if(subcount.size()>0){
            System.out.println("Submissions:");
        }
        for(Map.Entry<String, Integer> entry: subcount.entrySet()){
            System.out.println(entry.getKey()+" - "+entry.getValue());
        }





    }
}
