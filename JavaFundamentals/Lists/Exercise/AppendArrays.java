package FundamentalsModule.Lists.Exercise;

import java.util.*;
import java.util.stream.Collectors;

public class AppendArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<String> ninja = Arrays.stream(scanner.nextLine().split("\\|")).collect(Collectors.toList());
        Collections.reverse(ninja);
        String creamcheese = "";
        for(int i=0; i<ninja.size(); i++){
            creamcheese=creamcheese+ninja.get(i);
        }
        List<String> provalone = new ArrayList<>(Arrays.asList(creamcheese.split("\\s+")));
        for(int i=0; i<provalone.size(); i++){
            System.out.print(provalone.get(i)+" ");
        }

    }
}
