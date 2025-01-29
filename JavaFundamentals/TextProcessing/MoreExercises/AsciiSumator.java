package FundamentalsModule.TextProcessing.MoreExercises;

import java.util.Scanner;
public class AsciiSumator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String first  = scanner.nextLine();
        String second = scanner.nextLine();
        String third = scanner.nextLine();

        int firstnum = first.charAt(0);
        int secondnum = second.charAt(0);
        int blank;

        if(firstnum<secondnum){
            blank = firstnum;
            firstnum=secondnum;
            secondnum=blank;
        }

        int total = 0;


        for(int i=0; i<third.length(); i++){
            if(third.charAt(i)<firstnum && third.charAt(i)>secondnum){
                total = total+third.charAt(i);
            }
        }
        System.out.println(total);





    }
}
