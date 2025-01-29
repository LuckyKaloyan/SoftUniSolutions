package FundamentalsModule.BasicSyntaxConditionalStatements.Lab;

import java.util.Scanner;
public class TheathrePromotions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String day = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());


        if(age<0 || age>122){
            System.out.println("Error!");
        }else
        if(day.equals("Weekday")){
            if(age<=18){System.out.println("12$");}
            if(18<age && age<=64){System.out.println("18$");}
            if(64<age){System.out.println("12$");}
        }
        else  if(day.equals("Weekend")){
            if(age<=18){System.out.println("15$");}
            if(18<age && age<=64){System.out.println("20$");}
            if(64<age ){System.out.println("15$");}
        }
        else if(day.equals("Holiday")){
            if(age<=18){System.out.println("5$");}
            if(18<age && age<=64){System.out.println("12$");}
            if(64<age){System.out.println("10$");}
        }



    }
}
