package AdvancedModule.StreamFilesDirectories.Exercise;

import java.io.*;

public class LineNumbers {
    public static void main(String[] args) throws IOException {

        BufferedReader kebab = new BufferedReader(new FileReader("C:\\Users\\User\\Desktop\\Resource\\Exercises Resources\\inputLineNumbers.txt"));
        BufferedWriter kiufte = new BufferedWriter(new FileWriter("C:\\Users\\User\\Desktop\\Resource\\Exercises Resources\\output.txt"));


        String line = kebab.readLine();
          int number = 1;

        while(line!=null){
            kiufte.write(number+". "+line+System.lineSeparator());
             number++;
            line = kebab.readLine();
        }

        kebab.close();
        kiufte.close();
    }
}
