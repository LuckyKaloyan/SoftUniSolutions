package EntryModule.ConditionalStatements.Lab;

import java.util.Scanner;
public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        if(n%2==1 || n%2==-1){
            System.out.println("odd");
        }else{System.out.println("even");}





    }
}
