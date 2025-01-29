package EntryModule.ForLoops.Lab;

import java.util.Scanner;
public class biggestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());
        int biggest = Integer.MIN_VALUE;
        int lowest = Integer.MAX_VALUE;

        for(int i=0; i<n; i++){
            int x = Integer.parseInt(scanner.nextLine());
            if(x>biggest){biggest=x;}
            if(x<lowest){lowest=x;}

        }
        System.out.println("Max number: "+biggest);
        System.out.println("Min number: "+lowest);




    }
}
