package FundamentalsModule.FinalExamPreparation;

import java.util.Scanner;
public class TheImitationGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder first = new StringBuilder(scanner.nextLine());
        String text = "";
        while(!text.equals("Decode")){
            text = scanner.nextLine();
            String[] arrText = text.split("\\|");
            if(arrText[0].equals("Move")){
                first.append(first.substring(0, Integer.parseInt(arrText[1])));
                first = new StringBuilder(first.substring(Integer.parseInt(arrText[1])));}
            if(arrText[0].equals("Insert")){
                first = new StringBuilder(first.substring(0, Integer.parseInt(arrText[1])) + arrText[2] +
                        first.substring(Integer.parseInt(arrText[1])));}

            if(arrText[0].equals("ChangeAll")){

                if(arrText[2].length()>1) {
                    for (int i = 0; i < first.length() - arrText[1].length(); i++) {
                        if (first.substring(i, i + arrText[1].length()).equals(arrText[2])) {
                            first = new StringBuilder(first.substring(0, i) + arrText[2] + first.substring(i + arrText[1].length()));
                        }
                    }
                }else{
                    for(int i=0; i<first.length(); i++){
                        if(first.charAt(i)==arrText[1].charAt(0)){
                            first = new StringBuilder(first.substring(0, i) + arrText[2] + first.substring(i + 1));
                        }
                    }
                }
            }
        }
        System.out.printf("The decrypted message is: %s", first);
    }
}
