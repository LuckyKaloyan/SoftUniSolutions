package FundamentalsModule.Methods.MoreExercises;

import java.util.Scanner;
public class DataTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        dataTypes(scanner.nextLine(), scanner.nextLine());
    }public static void dataTypes(String a, String b){
        if(a.equals("int")){int k = Integer.parseInt(b);
            System.out.println(k*2);}
        if (a.equals("real")) {double j = Double.parseDouble(b);
            System.out.printf("%2.2f", 1.50*j);}
        if(a.equals("string")){
            System.out.println("$"+b+"$");
        }
    }
}
