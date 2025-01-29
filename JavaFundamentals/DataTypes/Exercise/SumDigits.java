package FundamentalsModule.DataTypes.Exercise;

import java.util.Scanner;
public class SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());
        int sum=0;

        for(int i =0; i<String.valueOf(input).length(); i++){
            sum=sum+Integer.parseInt(String.valueOf(String.valueOf(input).charAt(i)));
        }
        System.out.println(sum);


    }
}
