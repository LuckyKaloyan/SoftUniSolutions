package EntryModule.BonusExcercises.NestedLoops;

import java.util.Scanner;
public class carNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int begining = Integer.parseInt(scanner.nextLine());
        int ending = Integer.parseInt(scanner.nextLine());

        for(int i=begining; i<=ending; i++){
            for(int j=begining; j<=ending; j++){
                for(int h=begining; h<=ending; h++){
                    for(int k=begining; k<=ending; k++){
                        if((i+k)%2!=0 && i>k && (j+h)%2==0){System.out.print(i+""+j+""+h+""+k+" ");}
                    }
                }
            }
        }



    }
}
