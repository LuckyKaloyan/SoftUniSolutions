package EntryModule.BonusExcercises.ForLoopMoreExcercises;

import java.util.Scanner;

import static java.lang.Integer.MIN_VALUE;

public class EqualPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int nn = Integer.parseInt(scanner.nextLine());
        int nnn = Integer.parseInt(scanner.nextLine());
        int previoussum = nn+nnn;
        int currentsum;
        int firstnumber = nn;
        int secondnumber = nnn;
        int maxdifferance = MIN_VALUE;
        int total = 0;

        boolean yesno = true;

        for(int i=0; i<n-1; i++){
            firstnumber=Integer.parseInt(scanner.nextLine());
            secondnumber=Integer.parseInt(scanner.nextLine());
            currentsum=firstnumber+secondnumber;
            if(currentsum==previoussum){total++;}
            else{
                yesno=false;
                if(Math.abs(previoussum-currentsum)>maxdifferance){maxdifferance=Math.abs(previoussum-currentsum);}}
            previoussum=currentsum;
        }

        if(yesno){
            System.out.printf("Yes, value=%d", firstnumber+secondnumber);
        }else{
            System.out.printf("No, maxdiff=%d", maxdifferance);
        }

    }
}
