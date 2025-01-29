package FundamentalsModule.Methods.Lab;

import java.util.Scanner;
public class MultiplyEvenByOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputed = scanner.nextLine();
        if(inputed.charAt(0)==('-')){inputed=inputed.substring(1,inputed.length());}

        input(inputed);
    }
    public static void input(String a){
        int oddsum = 0;
        int evensum = 0;

        for(int i=0; a.length()>i; i++){

            if(Integer.parseInt(String.valueOf(a.charAt(i)))%2==0){
                oddsum=oddsum+Integer.parseInt(String.valueOf(a.charAt(i)));
            }else{evensum=evensum+Integer.parseInt(String.valueOf(a.charAt(i)));}
        }
        System.out.println(evensum*oddsum);
    }
}
