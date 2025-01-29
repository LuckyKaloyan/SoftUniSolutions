package FundamentalsModule.MapsStreamsAPI.Exercise;

import java.util.*;

public class CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, List<String>> map = new LinkedHashMap<>();
        String word;

        while (!(word = scanner.nextLine()).equals("End")) {
            String[] arrei = word.split(" -> ");

            if (map.containsKey(arrei[0])) {
                List<String> listche = map.get(arrei[0]);

                if (!listche.contains(arrei[1])) {
                    listche.add(arrei[1]);
                }
            } else {
                List<String> listche = new ArrayList<>();
                listche.add(arrei[1]);
                map.put(arrei[0], listche);
            }
        }

        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            System.out.println(entry.getKey());
            for (int i = 0; i < entry.getValue().size(); i++) {
                System.out.println("-- " + entry.getValue().get(i));
            }
        }
    }
}
