package FundamentalsModule.BasicSyntaxConditionalStatements.Exercise;

import java.util.Scanner;
public class RageTax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int gamecount = Integer.parseInt(scanner.nextLine());
        double headsetprice = Double.parseDouble(scanner.nextLine());
        double mouseprice = Double.parseDouble(scanner.nextLine());
        double keyboardprice = Double.parseDouble(scanner.nextLine());
        double displayprice = Double.parseDouble(scanner.nextLine());
        double totalexpenses = 0;


        for(int i=1; i<=gamecount; i++){
            if(i%2==0){totalexpenses=totalexpenses+headsetprice;}
            if(i%3==0){totalexpenses=totalexpenses+mouseprice;}
            if(i%6==0){totalexpenses=totalexpenses+keyboardprice;}
            if(i%12==0){totalexpenses=totalexpenses+displayprice;}

        }
        System.out.printf("Rage expenses: %2.2f lv.", totalexpenses);



    }
}
