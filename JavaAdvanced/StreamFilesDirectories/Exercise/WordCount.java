package AdvancedModule.StreamFilesDirectories.Exercise;

import java.io.*;
import java.util.*;

public class WordCount {
    public static void main(String[] args) throws IOException {
        BufferedReader kebab = new BufferedReader(new FileReader("C:\\Users\\User\\Desktop\\Resource\\Exercises Resources\\words.txt"));
        String[] listche = kebab.readLine().split(" ");
        kebab.close();
        BufferedReader kiufte = new BufferedReader(new FileReader("C:\\Users\\User\\Desktop\\Resource\\Exercises Resources\\text.txt"));
        BufferedWriter karnache = new BufferedWriter(new FileWriter("C:\\Users\\User\\Desktop\\Resource\\Exercises Resources\\results.txt"));
        TreeMap<String, Integer> mapche = new TreeMap<>();

        for (String item : listche) {
            mapche.put(item, 0);
        }
        String line = kiufte.readLine();

        while (line != null) {
            String[] linesplit = line.split(" ");
            for (String k : linesplit) {
                for (String j : listche) {
                    if (j.equals(k)) {
                        mapche.put(j, mapche.get(j) + 1);
                    }
                }
            }
            line = kiufte.readLine();
        }
        List<Integer> chislata = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : mapche.entrySet()) {
            chislata.add(entry.getValue());
        }
        Collections.sort(chislata);
        Collections.reverse(chislata);
        for (int i : chislata) {
            for (Map.Entry<String, Integer> entry : mapche.entrySet()) {
                if (i == entry.getValue()) {
                    karnache.write(entry.getKey() + " - " + i + System.lineSeparator());
                    mapche.remove(entry.getKey());
                   break;
                }
            }
        }
        karnache.close();
        kiufte.close();
    }
}