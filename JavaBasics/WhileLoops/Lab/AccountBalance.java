package EntryModule.WhileLoops.Lab;

import java.util.Scanner;
public class AccountBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String go = "go";
        double total = 0;
        while(!go.equals("NoMoreMoney")){
            go = scanner.nextLine();
            if(go.equals("NoMoreMoney")){break;}
            double sum = Double.parseDouble(go);
            if(sum<0){
                System.out.println("Invalid operation!");
                break;
            }
            System.out.printf("Increase: %02.2f", sum);    System.out.println();

            total = total+sum;
        }
        System.out.printf("Total: %02.2f", total);




    }
}
