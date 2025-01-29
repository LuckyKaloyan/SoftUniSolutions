package FundamentalsModule.DataTypes.MoreExercises;

import java.util.*;
public class DataTypeFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = "";
        int number;
        double dabl;


        while (!word.equals("END")) {
            word = scanner.nextLine();
            if (word.equals("END")) {
                break;
            }
            try {
                number = Integer.parseInt(word);
                System.out.println(number + " is integer type");

            } catch (Exception e) {
                try {
                    dabl = Double.parseDouble(word);
                    System.out.println(dabl + " is floating point type");

                } catch (Exception ee) {
                    if (word.equalsIgnoreCase("true") || word.equalsIgnoreCase("false")) {
                        System.out.println(word + " is boolean type");

                    }else if(word.length()==1){
                        System.out.println(word+" is character type");
                    }else{
                        System.out.println(word+ " is string type");
                    }
                }
            }
        }

    }
}
