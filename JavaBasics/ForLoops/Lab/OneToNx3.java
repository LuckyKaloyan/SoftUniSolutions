package EntryModule.ForLoops.Lab;

import java.util.Scanner;
public class OneToNx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for(int i=1; i<=n; i=i+3){
            System.out.println(i);
        }

    }
}
