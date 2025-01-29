package FundamentalsModule.BasicSyntaxConditionalStatements.Exercise;

import java.util.Scanner;
public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double total = Double.parseDouble(scanner.nextLine());
        int count = Integer.parseInt(scanner.nextLine());

        double lightsaber = Double.parseDouble((scanner.nextLine()));
        double robes = Double.parseDouble(scanner.nextLine());
        double belts = Double.parseDouble((scanner.nextLine()));

        double lightsabercount = Math.ceil(count*1.1);
        double lightsabersum = lightsabercount*lightsaber;
        double robessum = count*robes;
        int beltscount;
        if(count>6){beltscount=count-(count/6);}else{beltscount=count;}
        double beltssum = beltscount*belts;



        double currenttotal = lightsabersum+robessum+beltssum;

        if(currenttotal<=total){
            System.out.printf("The money is enough - it would cost %2.2flv.", currenttotal);
        }else{
            System.out.printf("George Lucas will need %2.2flv more.", currenttotal-total);
        }





    }
}
