package FundamentalsModule.Methods.Lab;

import java.util.Scanner;
public class Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int times = Integer.parseInt(scanner.nextLine());
        double mark;

        double topstuds = 0;
        double fortofive = 0;
        double threetofor = 0;
        double fail = 0;
        double average =0;

        for(int i =0; i<times; i++){
            mark = Double.parseDouble(scanner.nextLine());
            average=average+mark;
            if(mark>=5){topstuds++;}
            if(mark<5 && mark>3.99){fortofive++;}
            if(mark<=3.99 && mark>=3){threetofor++;}
            if(mark<3){fail++;}
        }
        System.out.printf("Top students: %2.2f", (topstuds/times)*100); System.out.println("%");
        System.out.printf("Between 4.00 and 4.99: %2.2f", (fortofive/times)*100); System.out.println("%");
        System.out.printf("Between 3.00 and 3.99: %2.2f", (threetofor/times)*100); System.out.println("%");
        System.out.printf("Fail: %2.2f", (fail/times)*100); System.out.println("%");
        System.out.printf("Average: %2.2f", (average/times));


    }
}
