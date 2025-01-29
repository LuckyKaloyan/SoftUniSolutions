package FundamentalsModule.BasicSyntaxConditionalStatements.Lab;

import java.util.Scanner;
public class BackIn30minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int total = (hours*60)+minutes+30;


        if(total<1440) {
            if(total%60>9){
                System.out.println(total / 60+ ":"+total%60);
            }else{System.out.println(total / 60+ ":0"+total%60);}}else if(total%60>9){
            System.out.println("0:"+total%60);}else{System.out.println("0:0"+total%60);

        }
    }
}
