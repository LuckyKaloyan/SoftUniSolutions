package FundamentalsModule.Methods.Lab;

import java.util.Scanner;
public class MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        operation(Integer.parseInt(scanner.nextLine()), scanner.nextLine(), Integer.parseInt(scanner.nextLine()));

    }
    public static void operation(int a, String b, int c){
        if(b.equals("*")){
            System.out.println(a*c);
        }else if(b.equals("+")){
            System.out.println(a+c);
        }else if(b.equals("-")){
            System.out.println(a-c);
        }else if(b.equals("/")){
            System.out.println(a/c);
        }
    }
}
