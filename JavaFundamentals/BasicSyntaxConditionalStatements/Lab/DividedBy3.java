package FundamentalsModule.BasicSyntaxConditionalStatements.Lab;

import java.util.Scanner;
public class DividedBy3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = 1;

        while(i<100){
            i++;
            if(i%3==0){System.out.println(i);}}
    }
}
