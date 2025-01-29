package FundamentalsModule.BasicSyntaxConditionalStatements.Exercise;

import java.util.Scanner;
public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        String word2;
        String word3 = "";
        int tries = 0;
        boolean iftrue = false;
        while(!iftrue && tries<4){
            word2= scanner.nextLine();

            for(int i =word2.length()-1; i>=0; i--){
                word3=word3+word2.charAt(i);
            }
            if(word3.equals(word)){
                System.out.println("User "+word+" logged in.");
                iftrue=true;
                break;
            }else {
                tries++;
                if(tries==4){
                    System.out.println("User "+word+" blocked!");
                    if(tries==4){iftrue=true;}
                    break;
                }
                System.out.println("Incorrect password. Try again.");

            }

            if(iftrue){break;}
            word3="";

        }



    }
}
