package AdvancedModule.StreamFilesDirectories.Exercise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountCharacterTypes {
    public static void main(String[] args) throws IOException {

        BufferedReader kiufte = new BufferedReader(new FileReader("C:\\Users\\User\\Desktop\\Resource\\Exercises Resources\\input.txt"));
        String bytes = kiufte.readLine();
        int otherSymbols = 0;
        int vowels = 0;
        int punctuationMarks = 0;

        while(bytes!=null){
            for(int i=0; i<bytes.length(); i++){
                if(bytes.charAt(i)!=' '){
                    if(bytes.charAt(i)=='a' || bytes.charAt(i)=='o' || bytes.charAt(i)=='i' || bytes.charAt(i)=='e' || bytes.charAt(i)=='u'){
                        vowels++;
                    }else if(bytes.charAt(i)=='!' || bytes.charAt(i)==',' || bytes.charAt(i)=='.' || bytes.charAt(i)=='?'){
                        punctuationMarks++;
                    }else{
                        otherSymbols++;
                    }
                }
            }
            bytes = kiufte.readLine();
        }
        System.out.printf("Vowels: %d%nOther symbols: %d%nPunctuation: %d",vowels,otherSymbols,punctuationMarks);




    }
}