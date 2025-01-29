package AdvancedModule.SetsAndMaps.Exercise;
import java.util.*;
public class PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int times = Integer.parseInt(scanner.nextLine());
        String listche = "";
        for(int i=0; i<times; i++){
            listche = listche+ " "+scanner.nextLine();
        }
        String[] reallist = listche.split("\\s+");
        Set<String> setche = new TreeSet<>(Arrays.asList(reallist));
        setche.remove("");
        for(String s:setche){
            String k = s.replace(" ","");
            System.out.print(k+" ");
        }
    }
}