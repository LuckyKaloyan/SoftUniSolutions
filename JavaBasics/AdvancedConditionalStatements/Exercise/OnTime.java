package EntryModule.AdvancedConditionalStatements.Exercise;

import java.util.Scanner;
public class OnTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hourexam = Integer.parseInt(scanner.nextLine());
        int minuteexam = Integer.parseInt(scanner.nextLine());
        int totalexam = (hourexam*60)+minuteexam;
        int hourarrive = Integer.parseInt(scanner.nextLine());
        int minutearrive = Integer.parseInt(scanner.nextLine());
        int totalarrive = (hourarrive*60)+minutearrive;

        if(totalexam-totalarrive>30){
            System.out.println("Early");
            if(totalexam-totalarrive>=60){
                if(((totalexam-totalarrive)%60)/10==0){System.out.println((totalexam-totalarrive)/60+":0"+(totalexam-totalarrive)%60+" hours before the start");}
                else {System.out.println((totalexam-totalarrive)/60+":"+(totalexam-totalarrive)%60+" hours before the start");}
            }else{System.out.println((totalexam-totalarrive)+" minutes before the start");}
        }

        if(totalarrive-totalexam>0){
            System.out.println("Late");
            if(totalarrive-totalexam>=60){if((totalarrive-totalexam)%60/10==0){System.out.println((totalarrive-totalexam)/60+":0"+(totalarrive-totalexam)%60+" hours after the start");}
            else{System.out.println((totalarrive-totalexam)/60+":"+(totalarrive-totalexam)%60+" hours after the start");}
            }else{System.out.println((totalarrive-totalexam)+" minutes after the start");}
        }

        if(totalexam-totalarrive<=30 && totalexam-totalarrive>=0){
            System.out.println("On Time");
            if(totalexam-totalarrive>0){System.out.println((totalexam-totalarrive)+" minutes before the start");}
        }




    }
}
