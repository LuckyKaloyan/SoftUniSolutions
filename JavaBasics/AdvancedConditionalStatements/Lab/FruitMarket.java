package EntryModule.AdvancedConditionalStatements.Lab;

import java.util.Scanner;
public class FruitMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String day = scanner.nextLine();
        double quanitity = Double.parseDouble(scanner.nextLine());
        double price = 0;
        String fail = "no";



        switch(fruit){
            case "banana" :
                switch(day){
                    case "Monday":
                    case "Tuesday":
                    case "Wednesday":
                    case "Thursday":
                    case "Friday":
                        price=2.50;break;
                    case "Saturday":
                    case "Sunday":
                        price=2.70;break;
                    default : System.out.println("error");
                        fail="yes";

                        break;
                }break;
            case "apple" :
                switch(day){
                    case "Monday":
                    case "Tuesday":
                    case "Wednesday":
                    case "Thursday":
                    case "Friday":
                        price=1.20;break;
                    case "Saturday":
                    case "Sunday":
                        price=1.25;break;
                    default : System.out.println("error");
                        fail="yes";

                        break;
                }break;
            case "orange" :
                switch(day){
                    case "Monday":
                    case "Tuesday":
                    case "Wednesday":
                    case "Thursday":
                    case "Friday":
                        price=0.85;break;
                    case "Saturday":
                    case "Sunday":
                        price=0.90;break;
                    default : System.out.println("error");
                        fail="yes";

                        break;
                }break;
            case "grapefruit" :
                switch(day){
                    case "Monday":
                    case "Tuesday":
                    case "Wednesday":
                    case "Thursday":
                    case "Friday":
                        price=1.45;break;
                    case "Saturday":
                    case "Sunday":
                        price=1.60;break;
                    default : System.out.println("error");
                        fail="yes";

                        break;
                }break;
            case "kiwi" :
                switch(day){
                    case "Monday":
                    case "Tuesday":
                    case "Wednesday":
                    case "Thursday":
                    case "Friday":
                        price=2.70;break;
                    case "Saturday":
                    case "Sunday":
                        price=3.00;break;
                    default : System.out.println("error");
                        fail="yes";

                        break;
                }break;
            case "pineapple" :
                switch(day){
                    case "Monday":
                    case "Tuesday":
                    case "Wednesday":
                    case "Thursday":
                    case "Friday":
                        price=5.50;break;
                    case "Saturday":
                    case "Sunday":
                        price=5.60;break;
                    default : System.out.println("error");
                        fail="yes";

                        break;
                }break;
            case "grapes" :
                switch(day){
                    case "Monday":
                    case "Tuesday":
                    case "Wednesday":
                    case "Thursday":
                    case "Friday":
                        price=3.85;break;
                    case "Saturday":
                    case "Sunday":
                        price=4.20;break;
                    default : System.out.println("error");
                        fail="yes";

                        break;
                }break;
            default :
                System.out.println("error");
                fail="yes";

                break;
        }
        if(fail.equals("yes")){}
        else {
            System.out.printf("%02.2f", quanitity * price);
        }
    }
}
