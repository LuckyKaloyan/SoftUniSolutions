package FundamentalsModule.MapsStreamsAPI.Exercise;

import java.util.*;

public class StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int times = Integer.parseInt(scanner.nextLine());

        LinkedHashMap<String, List<Double>> map = new LinkedHashMap<>();

        for(int i=0; i<times; i++){
            String name = scanner.nextLine();
            Double mark = Double.parseDouble(scanner.nextLine());

            if(map.containsKey(name)){
                map.get(name).add(mark);

            }else{
                List<Double> listche = new ArrayList<>();
                listche.add(mark);
                map.put(name, listche);
            }

        }

        for(Map.Entry<String, List<Double>> entry:map.entrySet()){
            double total = 0;
            for(int i=0; i<entry.getValue().size(); i++){
                total = total+entry.getValue().get(i);
            }
            total = total/entry.getValue().size();
            if(total>=4.50){
                System.out.printf("%s -> %.2f%n", entry.getKey(),total );
            }

        }
    }
}
