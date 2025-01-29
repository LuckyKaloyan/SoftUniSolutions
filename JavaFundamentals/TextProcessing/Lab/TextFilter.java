package FundamentalsModule.TextProcessing.Lab;

import java.util.Scanner;
public class TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        String[] words = scanner.nextLine().split(", ");
        String line = scanner.nextLine();
        String filler = "";

        for(int i=0; i<words.length; i++){
            while(line.contains(words[i])){
                if(line.substring(i,i+words[i].length()-1).equals(words[i])){

                    for(int j=0; j<words[i].length(); j++){
                        filler = filler+"*";
                    }
                    line = line.replace(words[i],filler);
                    filler = "";

                }

                System.out.println(line);
                if(!line.contains(words[i])){break;}

            }
        }

        System.out.println(line);
    }
}

