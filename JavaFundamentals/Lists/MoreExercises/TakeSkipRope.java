package FundamentalsModule.Lists.MoreExercises;

import java.util.*;
public class TakeSkipRope {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        int counter = 0;
        int flow = 0;

        ArrayList<Integer> skip = new ArrayList<>();
        ArrayList<Integer> take = new ArrayList<>();

        StringBuilder koka = new StringBuilder(word);

        for (int i = 0; i < koka.length(); i++) {
            if (Character.isDigit(koka.charAt(i))) {
                counter++;
                if (counter % 2 == 0) {
                    skip.add(Integer.parseInt(String.valueOf(koka.charAt(i))));
                }
                if (counter % 2 == 1) {
                    take.add(Integer.parseInt(String.valueOf(koka.charAt(i))));
                }
                koka.deleteCharAt(i);
                i--;
            }

        }
        ArrayList<String> worda = new ArrayList<>();

        for(int i=0; i<koka.length(); i++){
            worda.add(String.valueOf(koka.charAt(i)));
        }

        for(int i=0; i<take.size(); i++){

            for(int j=flow; j<flow+take.get(i); j++){
                try{System.out.print(worda.get(j));}
                catch(Exception e){}
            }
            flow=flow+take.get(i);
            flow=flow+ skip.get(i);
        }
    }
}
