package FundamentalsModule.MidExamPreparation;

import java.util.Scanner;
public class ComputerStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = "";
        double total = 0;
        double withouttax = 0;
        String command = "";
        while(!word.equals("regular") && !word.equals("special")){
            word = scanner.nextLine();
            if(word.equals("regular") || word.equals("special")){

                if(total==0){
                    System.out.println("Invalid order!");
                    break;
                }
            }

            if(word.equals("regular")){command = "regular";
                break;}
            else if(word.equals("special")){command = "special";
                break;}
            else{
                if(Double.parseDouble(word)>0){
                    total = total+Double.parseDouble(word);
                }else{
                    System.out.println("Invalid price!");
                }
            }
        }
        if(total>0){
            withouttax = total;
            total = total*1.20;
            System.out.println("Congratulations you've just bought a new computer!");
            System.out.printf("Price without taxes: %.2f$", withouttax);
            System.out.println();
            System.out.printf("Taxes: %.2f$", total-withouttax);
            System.out.println();
            System.out.println("-----------");
            if(command.equals("special")){
                System.out.printf("Total price: %.2f$", total*0.9);
            }else{
                System.out.printf("Total price: %.2f$", total);
            }
        }


    }
}
