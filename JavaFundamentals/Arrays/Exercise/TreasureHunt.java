package FundamentalsModule.Arrays.Exercise;

import java.util.*;

public class TreasureHunt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] splitInput = scanner.nextLine().split("\\|");
        ArrayList<String> beginning = new ArrayList<>(Arrays.asList(splitInput));
        String word = "";
        String temporarary;
        int dropped;
        int steal;
        int indexafter;
        int originalsize = 0;
        double sum =0;


        while (!word.equals("Yohoho!")) {

            word = scanner.next();
            if(word.equals("Yohoho!")){break;}
            if (word.equals("Loot")) {

                int index = beginning.size();
                String[] loot = scanner.nextLine().split(" ");           ///Вкарва Лоотите в Бегина
                beginning.addAll(Arrays.asList(loot));



                if(loot.length>0) {
                    indexafter= beginning.size()-index-1;


                    for(int j=0; j<indexafter; j++){
                        temporarary= beginning.get(beginning.size()-1);

                        for(int i=beginning.size()-1; i>0; i--){
                            beginning.set(i, beginning.get(i-1));
                        }
                        beginning.set(0, temporarary);

                        beginning.removeIf(element -> element.trim().isEmpty());
                    }

                    if(loot.length>1){List<String> sublist = beginning.subList(0, indexafter);
                        Collections.reverse(sublist);}

                }


            }
            try {
                for (int i = 0; i < beginning.size(); i++) {
                    for (int j = 0; j < beginning.size(); j++) {
                        if (beginning.get(j).equals(beginning.get(i)) && i != j) {
                            beginning.remove(i);
                        }

                    }
                }
            }catch(Exception e){}

            if(word.equals("Drop")){
                dropped= scanner.nextInt();
                if(dropped<=beginning.size()-1 && dropped>=0){
                    temporarary=beginning.get(dropped);
                    beginning.remove(dropped);
                    beginning.add(temporarary);
                }

            }
            if(word.equals("Steal")){
                if(beginning.size()>0) {originalsize=beginning.size();}
                steal = scanner.nextInt();
                if(steal>0 && beginning.size()>0){
                    if(steal>= beginning.size()){
                        for(int i=0; i<=beginning.size()-1; i++){
                            if(beginning.size()-1==i){System.out.print(beginning.get(i)+" ");}else
                            { System.out.print(beginning.get(i)+", ");}
                        }
                        beginning.clear();}else{

                        for(int xxl = steal; xxl>0; xxl--) {
                            if (1 == xxl) {
                                System.out.print(beginning.get(originalsize - steal));
                                beginning.remove(originalsize - steal);

                            } else {
                                System.out.print(beginning.get(originalsize - steal) + ", ");
                                beginning.remove(originalsize - steal);
                            }

                        }
                    }
                    System.out.println();
                }



            }}

        if(beginning.size()>0){
            for(int i=0; i< beginning.size(); i++){
                sum=sum+beginning.get(i).length();
            }}

        if(beginning.isEmpty()){
            System.out.println("Failed treasure hunt.");}
        else{System.out.printf("Average treasure gain: %2.2f pirate credits.", sum/beginning.size());}




        scanner.close();
    }
}
