package EntryModule.ConditionalStatements.Exercise;

import java.util.Scanner;
public class LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int duration = Integer.parseInt(scanner.nextLine());
        int restduration = Integer.parseInt(scanner.nextLine());


        double  eat = restduration/8.0;
        double chill = restduration/4.0;

        double totaltime = duration+eat+chill;

        if(totaltime>restduration){
            System.out.printf("You don't have enough time to watch " + name + ", you need %.0f more minutes.", Math.ceil(totaltime-restduration));
        }else System.out.printf("You have enough time to watch "+ name +" and left with %.0f minutes free time.", Math.ceil(restduration-(totaltime)));

    }
}
