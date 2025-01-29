package AdvancedModule.SetsAndMaps.Lab;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] arreiche = Arrays.stream(scanner.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
        LinkedHashMap<Double,Integer> mapche = new LinkedHashMap<>();


        for(int i=0; i<arreiche.length; i++){
            if(mapche.containsKey(arreiche[i])){
                mapche.put(arreiche[i],mapche.get(arreiche[i])+1);
            }else{mapche.put(arreiche[i],1);}
        }

        for(Map.Entry<Double,Integer> entry: mapche.entrySet()){
            System.out.printf("%.1f -> %d",entry.getKey(),entry.getValue());
            System.out.println();
        }
    }
}
