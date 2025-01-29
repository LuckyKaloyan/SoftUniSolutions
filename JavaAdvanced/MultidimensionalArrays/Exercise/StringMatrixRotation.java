package AdvancedModule.MultidimensionalArrays.Exercise;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class StringMatrixRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputword = scanner.nextLine();
        String fix = inputword.substring(7);
        fix = fix.substring(0,fix.length()-1);
        int fixxed = Integer.parseInt(fix);

        if(fixxed>=360){
            while(fixxed>360){
                fixxed=fixxed-360;
            }
        }
        inputword = "Rotate("+fixxed+")";
        List<String> listche = new ArrayList<>();
        String input = scanner.nextLine();
        while(!input.equals("END")){
            listche.add(input);
            input = scanner.nextLine();
        }
        String[][] arreiche = new String[listche.size()][];
        for(int i=0; i<listche.size(); i++){
            arreiche[i]=listche.get(i).split("");
            }
        if(inputword.equals("Rotate(90)")) {
            int longest = 0;

            for(int i=0; i<arreiche.length; i++){
                if(arreiche[i].length>longest){
                    longest=arreiche[i].length;
                }
            }
            for(int j=0; j<longest; j++){
                for(int i=arreiche.length-1; i>=0; i--){
                    try{
                        System.out.print((arreiche[i][j]));
                    }catch(Exception a){
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
        if(inputword.equals("Rotate(180)")){
            int longest = 0;
            for(int i=0; i<arreiche.length; i++){
                if(arreiche[i].length>longest){
                    longest=arreiche[i].length;
                }
            }
            for(int i= arreiche.length-1; i>=0; i--){
                for(int j=longest-1; j>=0; j--){
                    try{
                        System.out.print((arreiche[i][j]));
                    }catch(Exception a){
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
        if(inputword.equals("Rotate(270)")){
            int longest = 0;
            for(int i=0; i<arreiche.length; i++){
                if(arreiche[i].length>longest){
                    longest=arreiche[i].length;
                }
            }
            for(int i= longest-1; i>=0; i--){
                for(int j=0; j< arreiche.length; j++){
                    try{
                        System.out.print((arreiche[j][i]));
                    }catch(Exception a){
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
        if(inputword.equals("Rotate(360)")){
            for(int i=0; i<arreiche.length; i++){
               for(int j=0; j<arreiche[i].length; j++){
                   System.out.print(arreiche[i][j]);
               }
                System.out.println();
            }
        }
        }
    }