package EntryModule.WhileLoops.Exercise;

import java.util.Scanner;
public class Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int squared = width*length;
        int eaten = 0;

        while(squared>eaten){
            String kogda = scanner.nextLine();
            if(kogda.equals("STOP")){
                System.out.printf("%d pieces are left.",(squared-eaten));
                break;
            }else {int shveps = Integer.parseInt(kogda);
                eaten=eaten+shveps;}

            if(eaten>=squared){
                System.out.printf("No more cake left! You need %d pieces more.", (eaten-squared));
            }


        }





    }
}
