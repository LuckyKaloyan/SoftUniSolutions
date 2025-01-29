package EntryModule.AdvancedConditionalStatements.Exercise;

import java.util.Scanner;
public class SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int stay = Integer.parseInt(scanner.nextLine());
        String typeroom = scanner.nextLine();
        String plusminus = scanner.nextLine();
        double price = 0;

        switch(typeroom){
            case "room for one person": price=18.00;break;
            case "apartment":price=25.00;
                if(stay<10){price=price*0.7;}
                else if(stay<=15){price=price*0.65;}
                else {price=price*0.5;}
                break;
            case "president apartment":price=35.00;
                if(stay<10){price=price*0.9;}
                else if(stay<=15){price=price*0.85;}
                else{price=price*0.8;}
                break;
        }
        if(plusminus.equals("positive")){price=price*1.25;}
        else{price=price*0.9;}

        System.out.printf("%02.2f",(stay-1)*price);
    }
}
