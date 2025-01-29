package AdvancedModule.SetsAndMaps.Lab;
import java.util.*;
public class AcademyGraduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
        TreeMap<String,Double> mapche = new TreeMap<>();
        for(int i=0; i<input; i++){
            String name = scanner.nextLine();
            double[] arreiche = Arrays.stream(scanner.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
            double total = 0;
            for(int j=0; j<arreiche.length; j++){
                total = total+arreiche[j];

            }
            total = total/arreiche.length;
            mapche.put(name, total);
        }
        for(Map.Entry<String, Double> entry: mapche.entrySet()){
            System.out.println(entry.getKey()+" is graduated with "+entry.getValue());
        }
    }
}