package EntryModule.ConditionalStatements.Exercise;

import java.util.Scanner;
public class TimePlus15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chas = Integer.parseInt(scanner.nextLine());
        int minuti = Integer.parseInt(scanner.nextLine());
        int obshtovreme = chas*60+minuti+15;

        int chasovesled = obshtovreme/60;
        int minutisled = obshtovreme%60;

        if(chasovesled==24){chasovesled=0;}

        if(minutisled<10){
            System.out.println(chasovesled+":0"+minutisled);
        }else{System.out.println(chasovesled+":"+minutisled);}

    }
}
