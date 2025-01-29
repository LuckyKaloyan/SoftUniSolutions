package AdvancedModule.StreamFilesDirectories.Exercise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SumBytes {
    public static void main(String[] args) throws IOException {

        BufferedReader kiufte = new BufferedReader(new FileReader("C:\\Users\\LuckyK\\Desktop\\Directory\\input.txt"));
        String bytes = kiufte.readLine();
        int size = 0;

        while(bytes!=null){
            for(int i=0; i<bytes.length(); i++){
                size = size+bytes.charAt(i);
            }
            bytes = kiufte.readLine();
        }
        System.out.println(size);




    }
}