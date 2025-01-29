package FundamentalsModule.DataTypes.Exercise;

import java.util.Scanner;
public class WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());
        int number;
        int sum = 255;
        for(int i=0; i<input; i++){

            number = Integer.parseInt(scanner.nextLine());

            if(sum-number>=0){sum=sum-number;}
            else{
                System.out.println("Insufficient capacity!");
            }
        }
        System.out.println(255-sum);
    }
}

