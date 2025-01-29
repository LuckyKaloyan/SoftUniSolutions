package FundamentalsModule.ObjectsAndClasses.Lab;

import java.math.BigInteger;
import java.util.*;
public class BigFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int kiufte = Integer.parseInt(scanner.nextLine());
        BigInteger sum = new BigInteger("1");
        BigInteger kebabche;


        for(int i=1; i<=kiufte; i++){

            kebabche = new BigInteger(String.valueOf(i));

            sum=sum.multiply(kebabche);

        }
        System.out.println(sum);



    }
}
