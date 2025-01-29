package EntryModule.BonusExcercises.NestedLoops;

import java.util.Scanner;
public class Profit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());
        int number5 = Integer.parseInt(scanner.nextLine());
        int sum = Integer.parseInt(scanner.nextLine());

        for(int i=0; i<=number1; i++){
            for(int j=0; j<=number2; j++){
                for(int h=0; h<=number5; h++){

                    if(i+(j*2)+(h*5)==sum){
                        System.out.printf("%d * 1 lv. + %d * 2 lv. + %d * 5 lv. = %d lv.%n", i, j, h, sum);

                    }
                }
            }
        }


    }
}
