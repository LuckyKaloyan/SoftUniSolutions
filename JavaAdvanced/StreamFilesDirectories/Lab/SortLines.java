package AdvancedModule.StreamFilesDirectories.Lab;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class SortLines {
    public static void main(String[] args) throws IOException {


        Path inputsPath = Paths.get("C:\\Users\\User\\Desktop\\Материали\\input.txt");
        List<String> lines = Files.readAllLines(inputsPath);

        BufferedWriter kebab = new BufferedWriter(new FileWriter("C:\\Users\\User\\Desktop\\Материали\\output.txt"));
        Collections.sort(lines);

        for (String line : lines) {
            kebab.write(line + System.lineSeparator());
        }

        kebab.close();








    }
}
