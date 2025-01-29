package EntryModule.AdvancedConditionalStatements.Lab;

import java.util.Scanner;
public class Comission {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String city = scanner.nextLine();
        double sellings = Double.parseDouble(scanner.nextLine());
        double comission;



        switch(city){
            case "Sofia" :
                if(0<=sellings && sellings<=500){comission=0.05;
                    System.out.printf("%02.2f", (sellings*comission));}
                if(500<sellings && sellings<=1000){comission=0.07;
                    System.out.printf("%02.2f", (sellings*comission));}
                if(1000<sellings && sellings<=10000){comission=0.08;
                    System.out.printf("%02.2f", (sellings*comission));}
                if(10000<sellings){comission=0.12;
                    System.out.printf("%02.2f", (sellings*comission));}
                if(sellings<0){
                    System.out.println("error");
                }break;
            case "Varna" :
                if(0<=sellings && sellings<=500){comission=0.045;
                    System.out.printf("%02.2f", (sellings*comission));}
                if(500<sellings && sellings<=1000){comission=0.075;
                    System.out.printf("%02.2f", (sellings*comission));}
                if(1000<sellings && sellings<=10000){comission=0.10;
                    System.out.printf("%02.2f", (sellings*comission));}
                if(10000<sellings){comission=0.13;
                    System.out.printf("%02.2f", (sellings*comission));}
                if(sellings<0){
                    System.out.println("error");
                }break;

            case "Plovdiv" :
                if(0<=sellings && sellings<=500){comission=0.055;
                    System.out.printf("%02.2f", (sellings*comission));}
                if(500<sellings && sellings<=1000){comission=0.08;
                    System.out.printf("%02.2f", (sellings*comission));}
                if(1000<sellings && sellings<=10000){comission=0.12;
                    System.out.printf("%02.2f", (sellings*comission));}
                if(10000<sellings){comission=0.145;
                    System.out.printf("%02.2f", (sellings*comission));}
                if(sellings<0){
                    System.out.println("error");
                }
                break;
            default:
                System.out.println("error");
        }
    }
}
