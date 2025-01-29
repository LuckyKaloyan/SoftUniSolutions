package EntryModule.ForLoops.Exercise;

import java.util.Scanner;
public class Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double n = Double.parseDouble(scanner.nextLine());
        double p1=0;
        double p2=0;
        double p3=0;
        double p4=0;
        double p5=0;

        for(int i=0; i<n; i++){
            int x = Integer.parseInt(scanner.nextLine());
            if(x<200){p1++;}
            if(x>=200 && x<400){p2++;}
            if(x>=400 && x<600){p3++;}
            if(x>=600 && x<800){p4++;}
            if(x>=800){p5++;}
        }
        double result1 = (p1/n)*100;
        double result2 = (p2/n)*100;
        double result3 = (p3/n)*100;
        double result4 = (p4/n)*100;
        double result5 = (p5/n)*100;

        System.out.printf("%02.2f", result1);System.out.print("%");
        System.out.println();
        System.out.printf("%02.2f", result2);System.out.print("%");
        System.out.println();
        System.out.printf("%02.2f", result3);System.out.print("%");
        System.out.println();
        System.out.printf("%02.2f", result4);System.out.print("%");
        System.out.println();
        System.out.printf("%02.2f", result5);System.out.print("%");



    }
}
