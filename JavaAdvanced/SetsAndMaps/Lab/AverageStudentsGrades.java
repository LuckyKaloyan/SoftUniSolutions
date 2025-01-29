package AdvancedModule.SetsAndMaps.Lab;
import java.util.*;

public class AverageStudentsGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int times = Integer.parseInt(scanner.nextLine());
        TreeMap<String, List<Double>> mapche = new TreeMap<>();

        for(int i=0; i<times; i++){
            String[] input = scanner.nextLine().split(" ");
            String name = input[0];
            double mark = Double.parseDouble(input[1]);

            if(mapche.containsKey(name)){
                mapche.get(name).add(mark);
            }else{
                List<Double> listche = new ArrayList<>();
                listche.add(mark);
                mapche.put(name, listche);
            }

        }

        for(Map.Entry<String,List<Double>>entry: mapche.entrySet()){
            System.out.print(entry.getKey()+" -> ");
            double average = 0;
            for(int i=0; i<entry.getValue().size(); i++){
                System.out.printf("%.2f ",entry.getValue().get(i));
                average = average+entry.getValue().get(i);
            }
            System.out.printf("(avg: %.2f)%n",average/entry.getValue().size());
        }
    }
}
