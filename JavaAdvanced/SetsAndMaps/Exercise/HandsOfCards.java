package AdvancedModule.SetsAndMaps.Exercise;
import java.util.*;
import java.util.stream.Collectors;

public class HandsOfCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashMap<String, String> mapche = new LinkedHashMap<>();
        String line;

        while(true){
            line = scanner.nextLine();
            if(line.equals("JOKER")){break;}
            String[] splitche = line.split(":");

            if(!mapche.containsKey(splitche[0])){
                mapche.put(splitche[0], splitche[1]);
            }else{
                mapche.put(splitche[0],mapche.get(splitche[0])+", "+splitche[1]);
            }
        }

        LinkedHashMap<String, Set<String>> mapche2 = new LinkedHashMap<>();

        for(Map.Entry<String,String> entry: mapche.entrySet()){
            mapche.put(entry.getKey(), entry.getValue().replace(",",""));
            mapche2.put(entry.getKey(),Arrays.stream(mapche.get(entry.getKey()).split("\\s+")).collect(Collectors.toSet()));
        }






        for(Map.Entry<String,Set<String>>entry: mapche2.entrySet()){
            System.out.print(entry.getKey());
            int total = 0;
            int currentcard = 0;
            for(String s:entry.getValue()){
                if(s.startsWith("10")){currentcard=10;}
                if(s.startsWith("2")){currentcard=2;}
                if(s.startsWith("3")){currentcard=3;}
                if(s.startsWith("4")){currentcard=4;}
                if(s.startsWith("5")){currentcard=5;}
                if(s.startsWith("6")){currentcard=6;}
                if(s.startsWith("7")){currentcard=7;}
                if(s.startsWith("8")){currentcard=8;}
                if(s.startsWith("9")){currentcard=9;}
                if(s.startsWith("J")){currentcard=11;}
                if(s.startsWith("Q")){currentcard=12;}
                if(s.startsWith("K")){currentcard=13;}
                if(s.startsWith("A")){currentcard=14;}
                if(s.endsWith("S")){currentcard=currentcard*4;}
                if(s.endsWith("H")){currentcard=currentcard*3;}
                if(s.endsWith("D")){currentcard=currentcard*2;}
                if(s.endsWith("C")){currentcard=currentcard*1;}
                total = total+currentcard;
                currentcard=0;
            }
            System.out.print(": "+total);
            System.out.println();
            total = 0;
            }
        }
}
