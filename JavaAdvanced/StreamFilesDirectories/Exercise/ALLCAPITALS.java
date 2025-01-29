package AdvancedModule.StreamFilesDirectories.Exercise;

import java.io.*;

public class ALLCAPITALS {
    public static void main(String[] args) throws IOException {

        BufferedReader kebab = new BufferedReader(new FileReader("C:\\Users\\User\\Desktop\\Resource\\input.txt"));
        BufferedWriter kiufte = new BufferedWriter(new FileWriter("C:\\Users\\User\\Desktop\\Resource\\output.txt"));
        String line = kebab.readLine();
        while(line!=null){
            kiufte.write(line.toUpperCase()+System.lineSeparator());
            line = kebab.readLine();
        }
        kebab.close();
        kiufte.close();
    }
}
