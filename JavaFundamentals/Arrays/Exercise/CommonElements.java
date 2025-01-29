package FundamentalsModule.Arrays.Exercise;

import java.util.Scanner;
public class CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstaray = scanner.nextLine().split(" ");
        String[] secondaray = scanner.nextLine().split(" ");
        String[] thirdaray = new String[secondaray.length];


        for(int i=0; i<secondaray.length; i++){
            for(int j=0;j<firstaray.length; j++){
                if(secondaray[i].equals(firstaray[j])){thirdaray[i]=secondaray[i];}
            }
        }
        for(int i=0; i<thirdaray.length; i++){
            if(thirdaray[i]!=null){System.out.print(thirdaray[i] + " ");}

        }





    }
}
