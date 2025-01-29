package FundamentalsModule.BasicSyntaxConditionalStatements.Exercise;

import java.util.Scanner;
public class StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());
        int sum=0;
        int lowsum =1;

        for(int i=0; i<String.valueOf(input).length(); i++){
            for(int k=1; k<=Integer.parseInt(String.valueOf(String.valueOf(input).charAt(i))); k++){
                lowsum=lowsum*k;}
            sum=sum+lowsum;
            lowsum=1;
        }
        if(sum==input){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
}
