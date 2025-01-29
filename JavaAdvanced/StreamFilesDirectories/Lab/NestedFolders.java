package AdvancedModule.StreamFilesDirectories.Lab;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NestedFolders {
    public static void main(String[] args) throws IOException {

        String folderPath = "C:\\Users\\User\\Desktop\\Материали\\Files-and-Streams";
        File folder = new File(folderPath);
        if (folder.exists() && folder.isDirectory()) {
            System.out.println(folder.getName());
            List<String> folders = new ArrayList<>();
            collectDirectories(folder, folders);
            Collections.reverse(folders);
            for (String folderName : folders) {
                System.out.println(folderName);
            }
            System.out.println(folders.size()+1 + " folders");
        }
    }

    public static void collectDirectories(File folder, List<String> folders) {
        File[] listOfFiles = folder.listFiles();
        if (listOfFiles != null) {
            for (File file : listOfFiles) {
                try {
                    if (file.isDirectory()) {
                        folders.add(file.getName());
                        collectDirectories(file, folders);
                    }
                } catch (SecurityException | NullPointerException e) {
                    System.out.println("Unable to access: " + file.getName());
                }
            }
        }
    }
}
