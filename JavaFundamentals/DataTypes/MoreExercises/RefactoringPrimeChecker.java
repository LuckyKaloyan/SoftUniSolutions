package FundamentalsModule.DataTypes.MoreExercises;

import java.util.Scanner;
public class RefactoringPrimeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int input = Integer.parseInt(scanner.nextLine());
        int count = 0;


        for(int i=2; i<=input; i++){
            for(int j=2; j<=i; j++){
                if(i%j==0){count++;}

            }
            if(count>1){
                System.out.println(i+" -> false");
            }else{
                System.out.println(i+" -> true");
            }
            count=0;
        }
    }
}
