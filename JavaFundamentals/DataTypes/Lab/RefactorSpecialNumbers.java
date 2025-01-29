package FundamentalsModule.DataTypes.Lab;

import java.util.Scanner;

public class RefactorSpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int printnumber;
        boolean ifTrue = false;

        for (int i = 1; i <= input; i++) {
            printnumber = i;
            while (i > 0) {
                sum += i % 10;
                i = i / 10;
            }
            if((sum == 5) || (sum == 7) || (sum == 11)){ifTrue=true;}
            if(ifTrue){
                System.out.printf("%d -> True%n", printnumber);}
            else{
                System.out.printf("%d -> False%n", printnumber);
            }
            ifTrue=false;
            sum = 0;
            i = printnumber;
        }
    }
}
