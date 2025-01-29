package FundamentalsModule.Arrays.Lab;

import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());

        int[] firstrow = new int[length];


        for(int i =length-1 ; i>=0; i--){
            firstrow[i]=Integer.parseInt(scanner.nextLine());
        }
        for(int i=0; i<length; i++){
            System.out.print(firstrow[i] + " ");
        }




    }
}
