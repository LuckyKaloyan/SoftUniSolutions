package AdvancedModule.SetsAndMaps.Lab;
import java.util.Scanner;
import java.util.LinkedHashMap;
import java.util.Map;
public class CitiesByContinentAndCountry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());
        LinkedHashMap<String,LinkedHashMap<String,String>> mapche = new LinkedHashMap<>();
        for(int i=0; i<input; i++){String[] splitted = scanner.nextLine().split(" ");

            if(!mapche.containsKey(splitted[0])){LinkedHashMap<String,String>mapche2 = new LinkedHashMap<>();
                mapche2.put(splitted[1],splitted[2]);mapche.put(splitted[0],mapche2);
            }else if(!mapche.get(splitted[0]).isEmpty()){mapche.get(splitted[0]).put(splitted[1],mapche.get(splitted[0]).get(splitted[1])+", "+splitted[2]);
                String badbad = mapche.get(splitted[0]).get(splitted[1]);
                badbad=badbad.replace("null, ","");mapche.get(splitted[0]).replace(splitted[1],badbad);
            }else{mapche.get(splitted[0]).put(splitted[1],splitted[2]);
            }
        }
            for(Map.Entry<String,LinkedHashMap<String,String>>entry: mapche.entrySet()){System.out.println(entry.getKey()+":");
            for(Map.Entry<String,String>entry1:entry.getValue().entrySet()){System.out.println(" "+entry1.getKey()+" -> "+entry1.getValue());
            }
        }
    }
}