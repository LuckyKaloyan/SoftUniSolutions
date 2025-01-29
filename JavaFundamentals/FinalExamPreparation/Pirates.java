package FundamentalsModule.FinalExamPreparation;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;


public class Pirates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, Integer> gold = new LinkedHashMap<>();
        LinkedHashMap<String,Integer> population = new LinkedHashMap<>();
        boolean remove = false;
        String input = scanner.nextLine();

        while(!input.equals("Sail")){
            String[] spliited = input.split("\\|\\|");
            if(gold.containsKey(spliited[0]) || population.containsKey(spliited[0])){
                gold.put(spliited[0],gold.get(spliited[0])+Integer.parseInt(spliited[2]));
                population.put(spliited[0],population.get(spliited[0])+Integer.parseInt(spliited[1]));

            }else{gold.put(spliited[0],Integer.parseInt(spliited[2]));
                population.put(spliited[0],Integer.parseInt(spliited[1]));}
            input = scanner.nextLine();
        }

        while(!input.equals("End")){
            String[] splitted =input.split("=>");

            if(splitted[0].equals("Plunder")){
                int killed;
                int goldstolen;

                if(gold.get(splitted[1])-Integer.parseInt(splitted[3])<=0){
                    goldstolen = gold.get(splitted[1]);
                    remove = true;

                }else{ goldstolen = Integer.parseInt(splitted[3]);}
                if(population.get(splitted[1])-Integer.parseInt(splitted[2])<=0){
                    killed = population.get(splitted[1]);
                    remove = true;
                }else{ killed = Integer.parseInt(splitted[2]);}

                gold.put(splitted[1],gold.get(splitted[1])-Integer.parseInt(splitted[3]));
                population.put(splitted[1],population.get(splitted[1])-Integer.parseInt(splitted[2]));
                System.out.printf("%s plundered! %d gold stolen, %d citizens killed.",splitted[1],goldstolen,killed);
                System.out.println();

            }
            if(remove){
                System.out.println(splitted[1]+" has been wiped off the map!");
                gold.remove(splitted[1]);
                population.remove(splitted[1]);}

            remove = false;

            if(splitted[0].equals("Prosper")){
                try{
                    if(Integer.parseInt(splitted[2])<0){
                        System.out.println("Gold added cannot be a negative number!");
                    }else{
                        System.out.printf("%d gold added to the city treasury. %s now has %d gold.",Integer.parseInt(splitted[2]),splitted[1],gold.get(splitted[1])+
                                Integer.parseInt(splitted[2]));
                        System.out.println();
                        gold.put(splitted[1],gold.get(splitted[1])+Integer.parseInt(splitted[2]));
                    }

                }catch(Exception ignored){}



            }
            input = scanner.nextLine();

        }
        if(gold.isEmpty() || population.isEmpty()){
            System.out.println("Ahoy, Captain! All targets have been plundered and destroyed!");
        }else{
            System.out.printf("Ahoy, Captain! There are %d wealthy settlements to go to:",gold.size());
            System.out.println();
            for(Map.Entry<String, Integer> entry: gold.entrySet()){
                System.out.printf("%s -> Population: %d citizens, Gold: %d kg", entry.getKey(),population.get(entry.getKey()),entry.getValue());
                System.out.println();
            }
        }

    }}
