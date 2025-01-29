package FundamentalsModule.Methods.Exercise;

import java.util.*;
public class SmallestOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        numbers(Integer.parseInt(scanner.nextLine()),Integer.parseInt(scanner.nextLine()),Integer.parseInt(scanner.nextLine()));
    } public static void numbers(int a, int b, int c){
        int max=Integer.MAX_VALUE;
        if(a<max){max=a;}
        if(b<max){max=b;}
        if(c<max){max=c;}
        System.out.println(max);
    }
}
