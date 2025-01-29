package EntryModule.BonusExcercises.ForLoopMoreExcercises;

import java.util.Scanner;
public class Logistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int times = Integer.parseInt(scanner.nextLine());
        int weight;
        double total = 0;
        double totalweight = 0;
        double numberbus = 0;
        double numbertruck = 0;
        double numbertrain = 0;

        for(int i=0; i<times; i++){
            weight=Integer.parseInt(scanner.nextLine());
            totalweight=totalweight+weight;
            if(weight<=3){total=total+weight*200; numberbus=numberbus+weight;}
            if(weight>=4 && weight<=11){total=total+weight*175;numbertruck=numbertruck+weight;}
            if(weight>=12){total=total+weight*120; numbertrain=numbertrain+weight;}

        }
        System.out.printf("%2.2f", total/totalweight);System.out.println();
        System.out.printf("%2.2f",(numberbus/totalweight)*100);  System.out.println("%");
        System.out.printf("%2.2f",(numbertruck/totalweight)*100); System.out.println("%");
        System.out.printf("%2.2f",(numbertrain/totalweight)*100); System.out.println("%");


    }
}
