package AdvancedModule.SetsAndMaps.Exercise;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Phonebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         String input = scanner.nextLine();
          Map<String,String> mapche = new HashMap<>();
         while(!input.equals("search")){
             String[] splitted = input.split("-");
             mapche.put(splitted[0],splitted[1]);
             input = scanner.nextLine();
         }
         while(!input.equals("stop")){
             input = scanner.nextLine();
             if(input.equals("stop")){break;}
             if(mapche.containsKey(input)){
                 System.out.println(input+" -> "+mapche.get(input));
             }else{
                 System.out.println("Contact "+input+" does not exist.");}

         }
    }
}