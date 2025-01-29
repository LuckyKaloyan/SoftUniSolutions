package FundamentalsModule.FinalExamPreparation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MirrorWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();

        int pairs = 0;
        List<String> listche = new ArrayList<>();
        List<String> listchetwo = new ArrayList<>();

        String regex = "([#|@])[a-zA-Z]{3,}\\1\\1[a-zA-Z]{3,}\\1";
        Pattern patter = Pattern.compile(regex);
        Matcher matcher = patter.matcher(word);

        while(matcher.find()){
            listche.add(matcher.group());
        }
        if(listche.size()>0){
            for(int i=0; i<listche.size(); i++){
                String kebab = "";

                String[] done = new String[2];
                try {
                    try {
                        String[] splitted = listche.get(i).split("##");
                        done[0] = splitted[0];
                        done[1] = splitted[1];
                    } catch (Exception two) {
                        String[] splitted = listche.get(i).split("@@");
                        done[0] = splitted[0];
                        done[1] = splitted[1];
                    }
                }catch(Exception ignored){}

                for(int j=done[0].length()-1; j>=0; j--){
                    kebab = kebab+String.valueOf(done[0].charAt(j));
                }
                if(kebab.equals(done[1])){
                    listchetwo.add(done[0]+" <=> "+done[1]);
                }

            }}
        if(listche.size()>0) {
            System.out.println(listche.size() + " word pairs found!");
        }else{
            System.out.println("No word pairs found!");
        }
        if(listchetwo.size()>0){
            System.out.println("The mirror words are: ");
            System.out.print(listchetwo.get(0).substring(1,listchetwo.get(0).length()-1));
            for(int i=1; i<listchetwo.size(); i++){
                System.out.print(", "+listchetwo.get(i).substring(1,listchetwo.get(i).length()-1));
            }
        }else{
            System.out.println("No mirror words!");
        }







    }
}
