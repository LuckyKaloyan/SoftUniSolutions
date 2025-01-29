package EntryModule.ForLoops.Lab;

import java.util.Scanner;
public class EvenExponenting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int result = 1;
        System.out.println("1");

        for(int i=0; i<n; i++){
            result=result*2;
            if(i%2==1){
                System.out.println(result);
            }

        }

    }
}
