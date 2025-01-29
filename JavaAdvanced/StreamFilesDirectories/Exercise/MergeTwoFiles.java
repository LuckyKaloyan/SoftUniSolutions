package AdvancedModule.StreamFilesDirectories.Exercise;

import java.io.*;

public class MergeTwoFiles {
    public static void main(String[] args) throws IOException {

        BufferedReader buffi = new BufferedReader(new FileReader("C:\\Users\\User\\Desktop\\Resource\\Exercises Resources\\inputOne.txt"));
        BufferedReader buffi2 = new BufferedReader(new FileReader("C:\\Users\\User\\Desktop\\Resource\\Exercises Resources\\inputTwo.txt"));
        BufferedWriter buffi3 = new BufferedWriter(new FileWriter("C:\\Users\\User\\Desktop\\Resource\\Exercises Resources\\outputmerge.txt"));

        String bytes1 = buffi.readLine();
        String bytes2 = buffi2.readLine();



        while(bytes1!=null){
            buffi3.write(bytes1+ System.lineSeparator());
            bytes1= buffi.readLine();
        }
        while(bytes2!=null){
            buffi3.write(bytes2+System.lineSeparator());
            bytes2=buffi2.readLine();
        }

        buffi.close();
        buffi2.close();
        buffi3.close();
    }
}
