package EntryModule.BonusExcercises.NestedLoops;

import java.util.Scanner;
public class UnlockingSecretRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxHundreds = Integer.parseInt(scanner.nextLine());
        int maxTens = Integer.parseInt(scanner.nextLine());
        int maxOnes = Integer.parseInt(scanner.nextLine());

        for(int i=0; i<=maxHundreds; i++){
            for(int j=0; j<=maxTens; j++){
                for(int h=0; h<=maxOnes; h++){

                    if(h%2==0 && (j==2 || j==7 || j==3 || j==5 ) && i%2==0 && i!=0 && h!=0){
                        System.out.println(i+" "+j+" "+h);
                    }


                }
            }
        }
    }
}
