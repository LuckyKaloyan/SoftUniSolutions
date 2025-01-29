package EntryModule.WhileLoops.Lab;

import java.util.Scanner;
public class Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        double average;
        double total = 0;
        int times2 = 0;
        int times = 0;

        while(times2<2){
            double grade = Double.parseDouble(scanner.nextLine());
            if(grade<4){times2++; }
            if(times2==2){System.out.printf("%s has been excluded at %d grade",name, times);
                break;}
            total = total+grade;
            times++;
            average=total/times;
            if(times==12){System.out.printf("%s graduated. Average grade: %02.2f", name, average);
                break;}
        }
    }
}
