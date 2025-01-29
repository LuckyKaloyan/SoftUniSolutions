package AdvancedModule.StreamFilesDirectories.Lab;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class ExtractIntegers {
    public static void main(String[] args) throws IOException {

        FileInputStream kiufte = new FileInputStream("input.txt");

        String megakiufte = "";
        int bytes = kiufte.read();
        while(bytes>=0){
            megakiufte=megakiufte+String.valueOf((char)bytes);
            bytes=kiufte.read();
        }

        String[] isdigit = megakiufte.split(" ");

        for(int i=0; i<isdigit.length; i++){
            try{

                System.out.println(Integer.parseInt(isdigit[i]));
            }catch(Exception ignored){}

        }
    }
}
