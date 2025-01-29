package EntryModule.ForLoops.Exercise;

import java.util.Scanner;
public class HalfSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        int max = Integer.MIN_VALUE;
        int total = 0;

        for(int i=0; i<num; i++){
            int n = Integer.parseInt(scanner.nextLine());
            if(n>max){max=n;}
            total=total+n;
        }

        total=total-max;
        if(total==max){
            System.out.println("Yes");
            System.out.println("Sum = "+max);
        }else{
            System.out.println("No");
            System.out.println("Diff = " + Math.abs(max-total));
        }





    }
}
