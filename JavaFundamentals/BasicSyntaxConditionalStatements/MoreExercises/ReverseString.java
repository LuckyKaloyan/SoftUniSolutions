package FundamentalsModule.BasicSyntaxConditionalStatements.MoreExercises;

import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(1+1==2){String a = scanner.nextLine();
            if(a.equals("end")){break;}String b = "";
            for(int i=a.length()-1; i>=0; i--){

                b=b+String.valueOf(a.charAt(i));

            }

            System.out.println(a + " = "+b);

        }
    }
}
