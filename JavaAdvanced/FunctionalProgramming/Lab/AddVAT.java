package AdvancedModule.FunctionalProgramming.Lab;
import java.util.Scanner;
import java.util.function.UnaryOperator;

public class AddVAT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        UnaryOperator<Double> taxes = d -> d*1.20;
        String[] input = scanner.nextLine().split(", ");

        System.out.println("Prices with VAT:");
        for(String s:input){
            System.out.printf("%.2f%n",taxes.apply(Double.parseDouble(s)));
        }
    }
}
