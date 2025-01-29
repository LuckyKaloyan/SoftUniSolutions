package FundamentalsModule.Methods.Lab;

import java.util.Scanner;
public class GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        if(input.equals("int")){
            getMax(Integer.parseInt(scanner.nextLine()), Integer.parseInt(scanner.nextLine()));
        }
        if(input.equals("char")){getMax(scanner.nextLine().charAt(0), scanner.nextLine().charAt(0));}
        if(input.equals("string")){getMax(scanner.nextLine(), scanner.nextLine());}
    }
    public static void getMax(int a, int b){
        System.out.println(Math.max(a, b));
    }
    public static void  getMax(String a, String b){

        if(a.compareTo(b)>=0){
            System.out.println(a);
        }else System.out.println(b);
    }
    public static void getMax(char a, char b){
        if(a>b){
            System.out.println(a);
        }else System.out.println(b);
    }
}
