package EntryModule.ForLoops.Lab;

import java.util.Scanner;
public class LeftAndRight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int firstsum = 0;
        int secondsum =0;

        for(int i=0; i<n; i++){
            int x = Integer.parseInt(scanner.nextLine());
            firstsum=firstsum+x;
        }
        for(int i=0; i<n; i++){
            int x = Integer.parseInt(scanner.nextLine());
            secondsum=secondsum+x;
        }
        if(firstsum-secondsum==0){
            System.out.println("Yes, sum = "+firstsum);
        }else{
            System.out.println("No, diff = "+Math.abs(firstsum-secondsum));
        }






    }
}
