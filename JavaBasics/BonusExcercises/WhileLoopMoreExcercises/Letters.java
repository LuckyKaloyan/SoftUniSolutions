package EntryModule.BonusExcercises.WhileLoopMoreExcercises;

import java.util.Scanner;
public class Letters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean n = false;
        boolean o = false;
        boolean c = false;

        String word = "";

        int nn = 0;
        int cc = 0;
        int oo = 0;

        String letter = scanner.nextLine();

        while(!letter.equals("End")){

            if(letter.equals("a") ||letter.equals("b") ||letter.equals("c") || letter.equals("d") || letter.equals("e") ||
                    letter.equals("f") ||letter.equals("g") ||letter.equals("h") ||letter.equals("i") ||letter.equals("j") ||
                    letter.equals("k") ||letter.equals("l") ||letter.equals("m") ||letter.equals("n") ||letter.equals("o") ||
                    letter.equals("p") ||letter.equals("q") ||letter.equals("r") ||letter.equals("s") ||letter.equals("t") ||
                    letter.equals("u") ||letter.equals("v") ||letter.equals("w") ||letter.equals("x") || letter.equals("y") ||letter.equals("z") ||

                    letter.equals("A") ||letter.equals("B") ||letter.equals("C") || letter.equals("D") || letter.equals("E") ||
                    letter.equals("F") ||letter.equals("G") ||letter.equals("H") ||letter.equals("I") ||letter.equals("J") ||
                    letter.equals("K") ||letter.equals("L") ||letter.equals("M") ||letter.equals("N") ||letter.equals("O") ||
                    letter.equals("P") ||letter.equals("Q") ||letter.equals("R") ||letter.equals("S") ||letter.equals("T") ||
                    letter.equals("U") ||letter.equals("V") ||letter.equals("W") ||letter.equals("X") || letter.equals("Y") ||letter.equals("Z"))


                if(letter.equals("n")){n=true;nn++;}else
                if(letter.equals("o")){o=true;oo++;}else
                if(letter.equals("c")){c=true;cc++;}else
                {
                    word=word+letter;}
            if(n && letter.equals("n") && (!o || !c) && nn>1){
                word=word+letter;
            }
            if(c && letter.equals("c") && (!o || !n) && cc>1){
                word=word+letter;
            }
            if(o && letter.equals("o") && (!n || !c) && oo>1){
                word=word+letter;
            }

            if(n && c && o){
                System.out.print(word);
                System.out.print(" ");
                n=false; nn=0;
                o=false; oo=0;
                c=false; cc=0;
                word="";
            }

            letter = scanner.nextLine();

        }



    }
}
