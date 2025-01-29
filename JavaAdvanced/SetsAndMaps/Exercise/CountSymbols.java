package AdvancedModule.SetsAndMaps.Exercise;
import java.util.*;
public class CountSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        TreeMap<Integer,Integer> mapche = new TreeMap<>();
        for(int i=0; i<input.length(); i++){
            if(!mapche.containsKey((int)input.charAt(i))){
                mapche.put((int)input.charAt(i),1);
            }else{
                mapche.put((int)input.charAt(i),mapche.get((int)input.charAt(i))+1);
            }
        }
        for(Map.Entry<Integer, Integer>entry: mapche.entrySet()){
            int wtf = entry.getKey();
            System.out.printf("%s: %d time/s%n",((char)wtf),entry.getValue());
        }
    }
}