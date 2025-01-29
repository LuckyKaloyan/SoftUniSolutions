package AdvancedModule.StreamFilesDirectories.Lab;
import java.io.File;
import java.io.IOException;
public class ListFiles {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\User\\Desktop\\Материали\\Files-and-Streams";
        File directory = new File(path);
        File[] listche = directory.listFiles();
        if(listche.length>0) {
            for (File file : listche) {
                if(file.isFile()){
                    System.out.println(file.getName()+": ["+file.length()+"]");
                }
            }
        }
    }
}