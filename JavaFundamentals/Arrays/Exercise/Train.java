package FundamentalsModule.Arrays.Exercise;

import java.util.Scanner;
public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int wagons = Integer.parseInt(scanner.nextLine());
        int[] wagonssits = new int[wagons];
        int sum = 0;

        for(int i=0; i<wagons; i++){
            wagonssits[i]=Integer.parseInt(scanner.nextLine());
            sum=sum+wagonssits[i];
        }
        for(int i=0; i<wagons; i++){
            System.out.print(wagonssits[i] + " ");

        }
        System.out.println();
        System.out.println(sum);





    }
}
