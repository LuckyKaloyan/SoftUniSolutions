package EntryModule.AdvancedConditionalStatements.Lab;

import java.util.Scanner;
public class SmallShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        String city = scanner.nextLine();
        double count = Double.parseDouble(scanner.nextLine());

        switch(product){
            case "coffee" :
                switch(city){
                    case "Varna" :
                        System.out.println(count*0.45);
                        break;
                    case "Plovdiv" :
                        System.out.println(count*0.40);
                        break;
                    case "Sofia" :
                        System.out.println(count*0.50);
                        break;
                }break;
            case "water" :
                switch(city){
                    case "Varna" :
                    case "Plovdiv" :
                        System.out.println(count*0.70);
                        break;
                    case "Sofia" :
                        System.out.println(count*0.80);
                        break;
                }break;
            case "beer" :
                switch(city){
                    case "Varna" :
                        System.out.println(count*1.10);
                        break;
                    case "Plovdiv" :
                        System.out.println(count*1.15);
                        break;
                    case "Sofia" :
                        System.out.println(count*1.20);
                        break;
                }break;
            case "sweets":
                switch(city){
                    case "Varna" :
                        System.out.println(count*1.35);
                        break;
                    case "Plovdiv" :
                        System.out.println(count*1.30);
                        break;
                    case "Sofia" :
                        System.out.println(count*1.45);
                        break;
                }break;
            case "peanuts":
                switch(city){
                    case "Varna" :
                        System.out.println(count*1.55);
                        break;
                    case "Plovdiv" :
                        System.out.println(count*1.50);
                        break;
                    case "Sofia" :
                        System.out.println(count*1.60);
                        break;
                }break;


        }







    }
}
