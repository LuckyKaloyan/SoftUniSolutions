package EntryModule.BonusExcercises.NestedLoops;

import java.util.Scanner;
public class Barcode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = Integer.parseInt(scanner.nextLine());
        int second   = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());

        for(int i=0; i<=first; i++){
            for(int k=0; k<=second; k++){
                for(int j=0; j<=third; j++){
                    if(i%2==0 && j%2==0 && i!=0 && j!=0 && (k==2 || k==3 || k==5 || k==7)){
                        System.out.println(i+" "+k+" "+j);
                    }
                }
            }
        }
    }
}
