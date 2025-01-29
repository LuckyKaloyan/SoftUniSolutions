package FundamentalsModule.Methods.MoreExercises;

import java.util.Scanner;
public class LongerLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        longerLine(Integer.parseInt(scanner.nextLine()), Integer.parseInt(scanner.nextLine()),
                Integer.parseInt(scanner.nextLine()), Integer.parseInt(scanner.nextLine()),
                Integer.parseInt(scanner.nextLine()), Integer.parseInt(scanner.nextLine()),
                Integer.parseInt(scanner.nextLine()), Integer.parseInt(scanner.nextLine()));

    }public static void longerLine(int a, int b, int c, int d, int e, int f, int g, int h){


        int k=((a-c)*(a-c))+((b-d)*(b-d));
        int j=((e-g)*(e-g))+((f-h)*(f-h));
        if(k>=j){
            if((a*a)+(b*b)<=(c*c)+(d*d)){System.out.println("("+a+", "+b+")"+"("+c+", "+d+")");}
            else{
                System.out.println("("+c+", "+d+")"+"("+a+", "+b+")");
            }

        }else{
            if((e*e)+(f*f)<=(g*g)+(h*h)){System.out.println("("+e+", "+f+")"+"("+g+", "+h+")");}
            else{
                System.out.println("("+g+", "+h+")"+"("+e+", "+f+")");
            }
        }

    }

}
