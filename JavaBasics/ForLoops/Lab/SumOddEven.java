package EntryModule.ForLoops.Lab;

import java.util.Scanner;
public class SumOddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sumOdd = 0;
        int sumEven = 0;

        for(int i=0; i<n; i++){
            int x = Integer.parseInt(scanner.nextLine());
            if(i%2!=0){sumEven=sumEven+x;}
            else{sumOdd=sumOdd+x;}
        }
        if(sumOdd==sumEven){
            System.out.println("Yes");
            System.out.println("Sum = "+sumOdd);
        }else {
            System.out.println("No");
            System.out.println("Diff = "+Math.abs(sumOdd-sumEven));
        }
    }
}
