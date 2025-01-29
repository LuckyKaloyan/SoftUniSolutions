package FundamentalsModule.Methods.Exercise;

import java.util.Scanner;
public class CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        charcters(scanner.nextLine().charAt(0), scanner.nextLine().charAt(0));

    }
    public static void charcters(char a, char b){

        char min = 0;
        char max = 0;

        if(a>b){max=a; min=b;}
        if(b>a){max=b; min=a;}


        for(char newone=(char)((int)min+1); max>newone; newone++){
            if(newone+1==max){
                System.out.print(newone);
            }else
                System.out.print(newone +" ");
        }

    }
}
