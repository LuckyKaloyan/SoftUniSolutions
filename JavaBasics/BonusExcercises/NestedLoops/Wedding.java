package EntryModule.BonusExcercises.NestedLoops;

import java.util.Scanner;
public class Wedding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int men = Integer.parseInt(scanner.nextLine());
        int women = Integer.parseInt(scanner.nextLine());
        int maxTable = Integer.parseInt(scanner.nextLine());
        int currentTable = 0;

        for(int i = 1; i<=men; i++){
            for(int j=1; j<=women; j++){
                currentTable++;

                System.out.print("("+i +" <-> "+j+") ");
                if(currentTable==maxTable){break;}
            }if(currentTable==maxTable){break;}
        }


    }
}
