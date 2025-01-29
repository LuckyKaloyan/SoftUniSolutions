package EntryModule.ConditionalStatements.Exercise;

import java.util.Scanner;
public class SumSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input1 = Integer.parseInt(scanner.nextLine());
        int input2 = Integer.parseInt(scanner.nextLine());
        int input3 = Integer.parseInt(scanner.nextLine());
        int total = input1+input2+input3;

        if(total>=60 && total%60>=10){
            System.out.println(total/60+":"+total%60);
        }
        if(total>=60 && total%60<10){
            System.out.println(total/60+":0"+total%60);
        }

        if(total<59 && total>=10){
            System.out.println("0:"+total);
        }
        if(total<10){
            System.out.println("0:0"+total);
        }



    }
}
