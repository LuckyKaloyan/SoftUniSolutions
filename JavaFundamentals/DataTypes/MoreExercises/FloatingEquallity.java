package FundamentalsModule.DataTypes.MoreExercises;

import java.util.*;
public class FloatingEquallity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double a = Double.parseDouble(scanner.nextLine());
        Double b = Double.parseDouble(scanner.nextLine());

        Double possitivea = null;
        Double possitiveb = null;
        if(a<0){possitivea=a*(-1);}
        else{possitivea=a;}
        if(b<0){possitiveb=b*(-1);}
        else{possitiveb=b;}


        if(String.valueOf(possitivea).length()>8){
            a=Double.parseDouble(String.valueOf(possitivea).substring(0, 7));
            b=Double.parseDouble(String.valueOf(possitiveb).substring(0, 7));
        }


        if(a.equals(b)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }


    }
}
