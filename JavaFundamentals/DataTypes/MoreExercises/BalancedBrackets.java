package FundamentalsModule.DataTypes.MoreExercises;

import java.util.Scanner;
public class BalancedBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean istakada = false;
        boolean bendjik = true;
        int n = Integer.parseInt(scanner.nextLine());

        int opening = 0;
        int closing = 0;

        String tray;



        for(int i = 0; i<n; i++){
            tray = scanner.nextLine();
            if(tray.equals("(")){opening++;}
            if(tray.equals(")")){closing++;}
            if(closing==1 && opening==0){bendjik=false;}
            if(closing-opening>=2 || opening-closing>=2){bendjik=false;}


            if(tray.equals("(")){istakada=true;}
            if(tray.equals(")") && istakada){istakada=false;}

        }
        if(!istakada && bendjik){
            System.out.println("BALANCED");
        }else{
            System.out.println("UNBALANCED");
        }
    }
}
