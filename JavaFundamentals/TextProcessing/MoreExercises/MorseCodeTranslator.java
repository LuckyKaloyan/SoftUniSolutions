package FundamentalsModule.TextProcessing.MoreExercises;

import java.util.Scanner;
public class MorseCodeTranslator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String A = ".-";
        String B = "-...";
        String C = "-.-.";
        String D = "-..";
        String E = ".";
        String F = "..-.";
        String G = "--.";
        String H = "....";
        String I = "..";
        String J = ".---";
        String K = "-.-";
        String L = ".-..";
        String M = "--";
        String N = "-.";
        String O = "---";
        String P = ".--.";
        String Q = "--.-";
        String R = ".-.";
        String S = "...";
        String T = "-";
        String U = "..-";
        String V = "...-";
        String W = ".--";
        String X =  "-..-";
        String Y = "-.--";
        String Z = "--..";
        String space = "|";


        String word = scanner.nextLine();
        String[] array = word.split(" ");


        for(int i=0; i<array.length; i++){

            if(array[i].equals(A)){System.out.print("A");}
            if(array[i].equals(B)){System.out.print("B");}
            if(array[i].equals(C)){System.out.print("C");}
            if(array[i].equals(D)){System.out.print("D");}
            if(array[i].equals(E)){System.out.print("E");}
            if(array[i].equals(F)){System.out.print("F");}
            if(array[i].equals(G)){System.out.print("G");}
            if(array[i].equals(H)){System.out.print("H");}
            if(array[i].equals(I)){System.out.print("I");}
            if(array[i].equals(J)){System.out.print("J");}
            if(array[i].equals(K)){System.out.print("K");}
            if(array[i].equals(L)){System.out.print("L");}
            if(array[i].equals(M)){System.out.print("M");}
            if(array[i].equals(N)){System.out.print("N");}
            if(array[i].equals(O)){System.out.print("O");}
            if(array[i].equals(P)){System.out.print("P");}
            if(array[i].equals(Q)){System.out.print("Q");}
            if(array[i].equals(R)){System.out.print("R");}
            if(array[i].equals(S)){System.out.print("S");}
            if(array[i].equals(T)){System.out.print("T");}
            if(array[i].equals(U)){System.out.print("U");}
            if(array[i].equals(V)){System.out.print("V");}
            if(array[i].equals(W)){System.out.print("W");}
            if(array[i].equals(X)){System.out.print("X");}
            if(array[i].equals(Y)){System.out.print("Y");}
            if(array[i].equals(Z)){System.out.print("Z");}
            if(array[i].equals(space)){
                System.out.print(" ");
            }



        }






    }
}
