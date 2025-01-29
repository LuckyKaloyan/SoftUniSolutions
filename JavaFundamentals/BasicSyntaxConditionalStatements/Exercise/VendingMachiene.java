package FundamentalsModule.BasicSyntaxConditionalStatements.Exercise;

import java.util.Scanner;
public class VendingMachiene {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = 0;

        String input = scanner.nextLine();
        if(!input.equals("Start")){sum=sum+Double.parseDouble(input);}

        while(!input.equals("Start")){
            input = scanner.nextLine();



            if(!input.equals("Start")){
                if(Double.parseDouble(input)==0.1 || Double.parseDouble(input)==0.2 || Double.parseDouble(input)==0.5 ||
                        Double.parseDouble(input)==1 || Double.parseDouble(input)==0.2){sum=sum+Double.parseDouble(input);}
                else{System.out.printf("Cannot accept %.2f",Double.parseDouble(input));
                    System.out.println();}
            }else{break;}
        }
        input = scanner.nextLine();
        while(!input.equals("End")) {

            if (input.equals("Coke")) {
                if (sum >= 1.0) {
                    System.out.println("Purchased Coke");
                    sum=sum-1.0;
                } else {
                    System.out.println("Sorry, not enough money");
                }
            }
            if (input.equals("Soda")) {
                if (sum >= 0.8) {
                    System.out.println("Purchased Soda");
                    sum=sum-0.8;
                } else {
                    System.out.println("Sorry, not enough money");
                }
            }
            if (input.equals("Crisps")) {
                if (sum >= 1.50) {
                    System.out.println("Purchased Crisps");
                    sum=sum-1.50;
                } else {
                    System.out.println("Sorry, not enough money");
                }
            }
            if (input.equals("Water")) {
                if (sum >= 0.70) {
                    System.out.println("Purchased Water");
                    sum=sum-0.70;
                } else {
                    System.out.println("Sorry, not enough money");
                }
            }
            if (input.equals("Nuts")) {
                if (sum >= 2.00) {
                    System.out.println("Purchased Nuts");
                    sum=sum-2.00;
                } else {
                    System.out.println("Sorry, not enough money");
                }
            }

            if (!input.equals("Soda") && !input.equals("Coke") && !input.equals("Water") && !input.equals("Nuts") &&
                    !input.equals("Crisps")) {
                System.out.println("Invalid product");
            }
            input = scanner.nextLine();
            if (input.equals("End")) {
                break;
            }
        }
        scanner.close();
        System.out.printf("Change: %.2f", sum);

    }
}
