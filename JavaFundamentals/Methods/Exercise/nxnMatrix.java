package FundamentalsModule.Methods.Exercise;

import java.util.Scanner;
public class nxnMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        nxn(Integer.parseInt(scanner.nextLine()));
    }
    public static void nxn(int a){
        for(int i=0; i<a; i++){
            for(int j=0; j<a; j++){
                if(j==a-1){System.out.print(a);}else{
                    System.out.print(a+" ");}

            }
            System.out.println();
        }
    }
}
