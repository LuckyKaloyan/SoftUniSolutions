package FundamentalsModule.MapsStreamsAPI.MoreExercises;

import java.util.*;

public class Ranking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word;
        LinkedHashMap<String, String> contests = new LinkedHashMap<>();
        TreeMap<String, List<String>> contestants = new TreeMap<>();
        String topname = "";
        int topscore = 0;
        int currentscore = 0;

        while(true){
            word = scanner.nextLine();
            if(word.equals("end of contests")){
                break;
            }
            String[] splitted = word.split(":");
            if(splitted.length==2){
                contests.putIfAbsent(splitted[0], splitted[1]);
            }
        }

        while(true){
            word = scanner.nextLine();
            if(word.equals("end of submissions")){
                break;
            }
            String[] splitted = word.split("=>");

            if(splitted.length==4){

                if(contests.containsKey(splitted[0]) && contests.get(splitted[0]).equals(splitted[1])){

                    if(contestants.containsKey(splitted[2])){
                        contestants.get(splitted[2]).add("#  "+splitted[0]+" -> "+splitted[3]);
                    }else{
                        List<String> listche = new ArrayList<>();
                        listche.add("#  "+splitted[0]+" -> "+splitted[3]);
                        contestants.put(splitted[2],listche);}
                }
            }
        }

        for (Map.Entry<String, List<String>> entry : contestants.entrySet()) {
            List<String> submissions = entry.getValue();

            for (int i = 0; i < submissions.size(); i++) {
                String[] valueOne = submissions.get(i).split(" -> ");
                String contestOne = valueOne[0].substring(2); // Remove '# '
                int scoreOne = Integer.parseInt(valueOne[1]);

                for (int j = i + 1; j < submissions.size(); j++) {
                    String[] valueTwo = submissions.get(j).split(" -> ");
                    String contestTwo = valueTwo[0].substring(2); // Remove '# '
                    int scoreTwo = Integer.parseInt(valueTwo[1]);

                    if (contestOne.equals(contestTwo)) {
                        if (scoreOne > scoreTwo) {
                            submissions.remove(j);
                            j--;
                        } else if (scoreTwo > scoreOne) {
                            submissions.remove(i);
                            i--;
                            break;
                        }
                    }
                }
            }
        }


        for(Map.Entry<String,List<String>> entry:contestants.entrySet()){
            String name= entry.getKey();
            TreeMap<Integer, String> kiufte = new TreeMap<>();
            for(int i=0; i<entry.getValue().size(); i++){
                String[] words = entry.getValue().get(i).split(" -> ");
                kiufte.put(Integer.parseInt(words[1]),words[0]);
            }
            for(Map.Entry<Integer,String> entry1:kiufte.entrySet()){
                currentscore = currentscore+entry1.getKey();
                if(currentscore>topscore){
                    topscore = currentscore;
                    topname = name;
                }

            }
            currentscore = 0;


        }


        System.out.printf("Best candidate is %s with total %d points.%n", topname, topscore);
        System.out.println("Ranking: ");
        for(Map.Entry<String,List<String>> entry:contestants.entrySet()){
            TreeMap<Integer, String> kiufte = new TreeMap<>();
            System.out.println(entry.getKey());
            for(int i=0; i<entry.getValue().size(); i++){
                String[] words = entry.getValue().get(i).split(" -> ");
                kiufte.put(Integer.parseInt(words[1]),words[0]);
            }
            List<Integer> numbers = new ArrayList<>();
            List<String> words = new ArrayList<>();
            for(Map.Entry<Integer,String> entry1:kiufte.entrySet()){
                numbers.add(entry1.getKey());
                words.add(entry1.getValue());
            }
            for(int i=numbers.size()-1; i>=0; i--){
                System.out.println(words.get(i)+" -> "+numbers.get(i));
            }

        }







    }
}
