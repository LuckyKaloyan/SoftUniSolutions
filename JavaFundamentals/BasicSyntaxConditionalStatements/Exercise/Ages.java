package FundamentalsModule.BasicSyntaxConditionalStatements.Exercise;

import java.util.Scanner;
public class Ages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h =  Integer.parseInt(scanner.nextLine());

        if(h>=0 && h<=2){System.out.println("baby");}
        if(h>=3 && h<=13){System.out.println("child");}
        if(h>=14 && h<=19){System.out.println("teenager");}
        if(h>=20 && h<=65){System.out.println("adult");}
        if(h>=66){System.out.println("elder");}
    }
}
