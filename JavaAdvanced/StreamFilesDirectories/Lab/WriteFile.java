package AdvancedModule.StreamFilesDirectories.Lab;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WriteFile {
    public static void main(String[] args) throws IOException {
        FileInputStream kiufte = new FileInputStream("C:\\Users\\LuckyK\\Desktop\\Directory\\input.txt");

        FileOutputStream kebabche = new FileOutputStream("C:\\Users\\LuckyK\\Desktop\\Directory\\output.txt");


        List<String> listche = new ArrayList<>();
        listche.add(",");
        listche.add("!");
        listche.add(".");
        listche.add("?");

        int oneByte = kiufte.read();

        while(oneByte>=0){

            if(!listche.contains(String.valueOf((char)oneByte))) {
                kebabche.write((char)oneByte);
            }
            oneByte = kiufte.read();
        }
    }
}