package FundamentalsModule.MidExamPreparation;

import java.util.Scanner;
public class MuOnline {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String[] words = input.split("\\|");
        int health = 100;
        int bitcoins = 0;
        boolean stayinalive = true;

        for(int i=0; i<words.length; i++){
            String[] splitsplit = words[i].split(" ");
            String word = splitsplit[0];
            int value = Integer.parseInt(splitsplit[1]);

            if(word.equals("potion")){
                if(health<100 && health+value>=100){
                    System.out.println("You healed for "+(100-health)+" hp.");
                    health=100;
                    System.out.println("Current health: "+health+" hp.");
                }else{
                    health=health+value;
                    System.out.println("You healed for "+value+" hp.");
                    System.out.println("Current health: "+health+" hp.");}

            }else if(word.equals("chest")){
                System.out.println("You found "+value+" bitcoins.");
                bitcoins = bitcoins+value;
            }else {
                if(health-value>0){
                    System.out.println("You slayed "+word+".");
                    health=health-value;
                }else{
                    System.out.println("You died! Killed by "+word+".");
                    System.out.println("Best room: "+(i+1));
                    stayinalive = false;
                    break;
                }
            }

        }
        if(stayinalive){
            System.out.println("You've made it!");
            System.out.println("Bitcoins: "+bitcoins);
            System.out.println("Health: "+health);
        }




    }
}
