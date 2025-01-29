package AdvancedModule.StreamFilesDirectories.Lab;

import java.io.*;

public class WriteEveryThirdLine {
    public static void main(String[] args) throws IOException {



        BufferedReader kek = new BufferedReader(new FileReader("C:\\Users\\LuckyK\\Desktop\\Directory\\input.txt"));
        BufferedWriter pep = new BufferedWriter(new FileWriter("C:\\Users\\LuckyK\\Desktop\\Directory\\output.txt"));

        int i = 0;
        String read = kek.readLine();

        while(read != null){
            try{
                i++;
                if(i%3==0){
                   pep.write(read);
                    pep.newLine();
                }
            }catch(Exception ignored){}
            read = kek.readLine();
        }
        pep.close();
        kek.close();








    }
}