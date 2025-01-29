package FundamentalsModule.FinalExamPreparation;

import java.util.Scanner;


public class WorldTour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();


        String word = "";
        while(!word.equals("Travel")){
            word = scanner.nextLine();
            if(!word.equals("Travel")){
                String[] splitted = word.split(":");
                try {
                    if (splitted[0].equals("Add Stop")) {
                        input = input.substring(0, Integer.parseInt(splitted[1])) + splitted[2] + input.substring(Integer.parseInt(splitted[1]));
                        System.out.println(input);
                    }
                    if (splitted[0].equals("Remove Stop")) {
                        input = input.substring(0, Integer.parseInt(splitted[1])) + input.substring(Integer.parseInt(splitted[2]) + 1);
                        System.out.println(input);
                    }
                    if (splitted[0].equals("Switch")) {
                        if (input.contains(splitted[1])) {
                            input = input.replaceAll(splitted[1], splitted[2]);
                            System.out.println(input);
                        }

                    }
                }catch(Exception ignored){}



            }else{break;}
        }
        System.out.printf("Ready for world tour! Planned stops: %s",input);


    }
}
