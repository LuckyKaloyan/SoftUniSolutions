package AdvancedModule.StreamFilesDirectories.Lab;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
public class CopyBytes {
    public static void main(String[] args) throws IOException {
        FileInputStream inputreader = new FileInputStream("C:\\Users\\LuckyK\\Desktop\\Directory\\input.txt");
        Scanner scanner = new Scanner(inputreader);

        int bytes = inputreader.read();
        while(bytes>=0){
            if(bytes==10){
                System.out.print((char)bytes);
            }else if(bytes==32){
                System.out.print(" ");
            }
            else{
                System.out.print(bytes);
            }
            bytes = inputreader.read();
        }

    }
}
