package FundamentalsModule.Methods.Exercise;

import java.util.Scanner;
public class TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        topNumber(scanner.nextLine());
    }
    public static void topNumber(String a){
        for(int i=0; i<Integer.parseInt(a); i++){
            int sum=0;
            boolean itstrue = false;

            for(int j=0; j<String.valueOf(i).length(); j++){
                sum=sum+Integer.parseInt(String.valueOf(String.valueOf(i).charAt(j)));
            }
            if(sum%8==0){

                for(int k=0; k<String.valueOf(i).length(); k++){
                    if(Integer.parseInt(String.valueOf(String.valueOf(i).charAt(k)))%2==1){
                        itstrue=true;}

                }
                if(itstrue){
                    System.out.println(i);
                }
            }

        }
    }

}
