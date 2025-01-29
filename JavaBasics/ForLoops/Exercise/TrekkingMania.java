package EntryModule.ForLoops.Exercise;

import java.util.Scanner;
public class TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int groups = Integer.parseInt(scanner.nextLine());
        int musalapeople = 0;
        int monbatpeople = 0;
        int kilimandjaropeople = 0;
        int k2people = 0;
        int everestpeople = 0;
        int totalcount = 0;
        for(int i =0; i<groups; i++){
            int count = Integer.parseInt(scanner.nextLine());
            if(count<6 && count>0){musalapeople=musalapeople+count;}
            if(count>=6 && count<=12){monbatpeople=monbatpeople+count;}
            if(count>=13 && count<=25){kilimandjaropeople=kilimandjaropeople+count;}
            if(count>=26 && count<=40){k2people=k2people+count;}
            if(count>=41){everestpeople=everestpeople+count;}
            totalcount=totalcount+count;}
        double musalaall = (double)(musalapeople*100)/totalcount;
        double monbatall = (double)(monbatpeople*100)/totalcount;
        double kilimandjaroall = (double)(kilimandjaropeople*100)/totalcount;
        double k2all = (double)(k2people*100)/totalcount;
        double everestall = (double)(everestpeople*100)/totalcount;
        System.out.printf("%02.2f", musalaall);System.out.print("%");
        System.out.println();
        System.out.printf("%02.2f", monbatall);System.out.print("%");
        System.out.println();
        System.out.printf("%02.2f", kilimandjaroall);System.out.print("%");
        System.out.println();
        System.out.printf("%02.2f", k2all);System.out.print("%");
        System.out.println();
        System.out.printf("%02.2f", everestall);System.out.print("%");
    }
}
