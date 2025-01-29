package FundamentalsModule.Methods.Exercise;

import java.util.*;
public class MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        middleChars(scanner.nextLine());



    }
    public static void middleChars(String a){

        if(a.length()%2==0){
            System.out.println(a.substring((a.length()/2)-1, a.length()/2+1));
        }else{
            System.out.println(a.charAt(a.length()/2));
        }
    }
}
