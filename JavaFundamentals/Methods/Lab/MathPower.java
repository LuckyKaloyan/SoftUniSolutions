package FundamentalsModule.Methods.Lab;

import java.text.DecimalFormat;
import java.util.Scanner;
public class MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(new DecimalFormat("0.####").format(method(Double.parseDouble(scanner.nextLine()), Integer.parseInt(scanner.nextLine()))));
    }
    public static double method(double input, int length) {
        double result = 1;

        for(int i=0; i<length; i++){
            result=result*input;
        }


        return result;
    }
}
