package FundamentalsModule.Methods.MoreExercises;

import java.util.Scanner;
public class CenterPoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        centerPoint(Integer.parseInt(scanner.nextLine()), Integer.parseInt(scanner.nextLine()),
                Integer.parseInt(scanner.nextLine()), Integer.parseInt(scanner.nextLine()));



    } public static void centerPoint(int a, int b, int c, int d){

        int k = Math.abs(a)*Math.abs(a)+Math.abs(b)*Math.abs(b);
        int j = Math.abs(c)*Math.abs(c)+Math.abs(d)*Math.abs(d);

        if(k<=j){
            System.out.println("("+a+", "+b+")");
        }else{
            System.out.println("("+c+", "+d+")");
        }
    }
}
