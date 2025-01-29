package AdvancedModule.SetsAndMaps.Exercise;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());
        Set<String> name = new LinkedHashSet<>();
        for(int i=0; i<count; i++){
            String word = scanner.nextLine();
            if(name.add(word)){
                System.out.println(word);
            }
        }
    }
}
