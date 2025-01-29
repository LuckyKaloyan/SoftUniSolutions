package FundamentalsModule.Methods.Lab;

import java.util.Scanner;
public class CalculateRectangularArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        rectangle(Integer.parseInt(scanner.nextLine()), Integer.parseInt(scanner.nextLine()));}


    public static void rectangle(int a, int b) {
        System.out.println(a*b);
    }
}
