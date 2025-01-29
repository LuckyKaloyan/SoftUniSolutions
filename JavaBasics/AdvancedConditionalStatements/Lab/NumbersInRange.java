package EntryModule.AdvancedConditionalStatements.Lab;

import java.util.Scanner;
public class NumbersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
        if(-100<=input && input<=100 && input!=0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
