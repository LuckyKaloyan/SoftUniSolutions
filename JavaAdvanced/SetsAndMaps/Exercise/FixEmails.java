package AdvancedModule.SetsAndMaps.Exercise;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class FixEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashMap<String,String> mapche = new LinkedHashMap<>();
        String name = scanner.nextLine();
        String email = scanner.nextLine();
        while(!name.equals("stop")){
            String emailche = email.toLowerCase();

            if(!emailche.endsWith("com") && !emailche.endsWith("uk") && !emailche.endsWith("us")){
                mapche.put(name,email);
            }
            name = scanner.nextLine();
            if(name.equals("stop")){break;}
            email = scanner.nextLine();
        }
        for(Map.Entry<String,String> entry: mapche.entrySet()){
            System.out.println(entry.getKey()+" -> "+entry.getValue());
        }
    }
}