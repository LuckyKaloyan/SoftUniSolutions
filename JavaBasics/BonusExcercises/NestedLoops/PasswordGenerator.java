package EntryModule.BonusExcercises.NestedLoops;

import java.util.Scanner;
public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int letters = Integer.parseInt(scanner.nextLine());

        String[] letter = new String[9];
        letter[0]="a";
        letter[1]="b";
        letter[2]="c";
        letter[3]="d";
        letter[4]="e";
        letter[5]="f";
        letter[6]="g";
        letter[7]="h";
        letter[8]="i";
        int hack = 1;

        for(int i = 1; i<number; i++){
            for(int k=1; k<number; k++){
                for(int j=0; j<letters; j++){
                    for(int l=0; l<letters; l++){
                        for(int o=1; o<=number; o++){
                            if(o>i && o>k){System.out.print(i+""+k+""+letter[j]+""+letter[l]+""+o+" ");}

                        }
                    }
                }
            }
        }



    }
}
