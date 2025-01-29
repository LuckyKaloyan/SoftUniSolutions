package FundamentalsModule.MapsStreamsAPI.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
public class SoftuniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int times = Integer.parseInt(scanner.nextLine());

        LinkedHashMap<String, String> map = new LinkedHashMap<>();
        for(int i =0; i<times; i++){
            String[] arrei = scanner.nextLine().split(" ");

            if(arrei[0].equals("register")){
                if(map.containsKey(arrei[1])){

                    System.out.printf("ERROR: already registered with plate number %s", arrei[2]);
                    System.out.println();

                }else{
                    map.put(arrei[1],arrei[2]);
                    System.out.printf("%s registered %s successfully", arrei[1], arrei[2]);
                    System.out.println();
                }
            }else{
                if(map.containsKey(arrei[1])){
                    System.out.println(arrei[1]+" unregistered successfully");
                    map.remove(arrei[1]);
                }else{
                    System.out.printf("ERROR: user %s not found", arrei[1]);
                    System.out.println();
                }
            }
        }
        for(Map.Entry<String, String> entry:map.entrySet()){
            System.out.println(entry.getKey()+" => "+entry.getValue());
        }
    }
}
