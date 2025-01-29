package FundamentalsModule.Methods.MoreExercises;

import java.util.Scanner;
public class Tribonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    }
    public static void tribonacci(int a){
        int[] value=new int[a];
        if(value.length>3){
            value[0]=1;
            value[1]=1;
            value[2]=2;
            value[3]=4;
        }
        for(int i=4; i<a; i++){
            value[i]=value[i-3]+value[i-1]+value[i-2];
        }
    }
}
