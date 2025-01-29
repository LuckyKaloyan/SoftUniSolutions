package EntryModule.AdvancedConditionalStatements.Exercise;

import java.util.Scanner;
public class SummerOutfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int time = Integer.parseInt(scanner.nextLine());
        String period = scanner.nextLine();

        switch(period){
            case "Morning" : if(10<=time && time<=18){
                System.out.printf("It's %d degrees, get your Sweatshirt and Sneakers.", time);
            }else if(18<time && time<=24){
                System.out.printf("It's %d degrees, get your Shirt and Moccasins.", time);
            }else if(time>=25){
                System.out.printf("It's %d degrees, get your T-Shirt and Sandals.", time);
            }break;
            case "Afternoon" : if(10<=time && time<=18){
                System.out.printf("It's %d degrees, get your Shirt and Moccasins.", time);
            }else if(18<time && time<=24){
                System.out.printf("It's %d degrees, get your T-Shirt and Sandals.", time);
            }else if(time>=25){
                System.out.printf("It's %d degrees, get your Swim Suit and Barefoot.", time);
            }break;
            case "Evening" : if(10<=time && time<=18){
                System.out.printf("It's %d degrees, get your Shirt and Moccasins.", time);
            }else if(18<time && time<=24){
                System.out.printf("It's %d degrees, get your Shirt and Moccasins.", time);
            }else if(time>=25){
                System.out.printf("It's %d degrees, get your Shirt and Moccasins.", time);
            }break;
        }
    }
}
