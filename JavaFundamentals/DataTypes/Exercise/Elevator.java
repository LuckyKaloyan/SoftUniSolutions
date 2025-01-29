package FundamentalsModule.DataTypes.Exercise;

import java.util.Scanner;
public class Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = Integer.parseInt(scanner.nextLine());
        int j = Integer.parseInt(scanner.nextLine());

        if(i/j>0){if(i%j>0){System.out.println((i/j)+1);}else{System.out.println(i/j);}}
        else if(j>0){
            System.out.println(1);
        }


    }
}
