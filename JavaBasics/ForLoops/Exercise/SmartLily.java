package EntryModule.ForLoops.Exercise;

import java.util.Scanner;
public class SmartLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = Integer.parseInt(scanner.nextLine());
        double price = Double.parseDouble(scanner.nextLine());
        int pricetoy = Integer.parseInt(scanner.nextLine());
        int toys =0;
        int money=1;
        for(int i=0; i<=age; i++){if(i%2==0){money=money+i*5;}if(i%2==0){money=money-1;}if(i%2==1){toys++;}}
        int money2 = toys*pricetoy;
        double collected = money+money2;
        if(collected>=price){System.out.printf("Yes! %02.2f", (collected-price));}else{System.out.printf("No! %02.2f", (price-collected));}}}

