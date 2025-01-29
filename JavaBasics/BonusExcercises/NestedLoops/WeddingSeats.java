package EntryModule.BonusExcercises.NestedLoops;

import java.util.Scanner;
public class WeddingSeats {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String lastrow = scanner.nextLine();
        int lastrowint=999999999;
        if(lastrow.equals("A")){lastrowint=1;} if(lastrow.equals("B")){lastrowint=2;}
        if(lastrow.equals("D")){lastrowint=4;}if(lastrow.equals("P")){lastrowint=16;}
        if(lastrow.equals("E")){lastrowint=5;}if(lastrow.equals("C")){lastrowint=3;}
        if(lastrow.equals("F")){lastrowint=6;}if(lastrow.equals("Z")){lastrowint=26;}
        if(lastrow.equals("G")){lastrowint=7;}if(lastrow.equals("Y")){lastrowint=25;}
        if(lastrow.equals("H")){lastrowint=8;}if(lastrow.equals("X")){lastrowint=24;}
        if(lastrow.equals("I")){lastrowint=9;}if(lastrow.equals("W")){lastrowint=23;}
        if(lastrow.equals("J")){lastrowint=10;}if(lastrow.equals("V")){lastrowint=22;}
        if(lastrow.equals("K")){lastrowint=11;}if(lastrow.equals("T")){lastrowint=20;}
        if(lastrow.equals("L")){lastrowint=12;}if(lastrow.equals("U")){lastrowint=21;}
        if(lastrow.equals("M")){lastrowint=13;}if(lastrow.equals("S")){lastrowint=19;}
        if(lastrow.equals("N")){lastrowint=14;}if(lastrow.equals("Q")){lastrowint=17;}
        if(lastrow.equals("O")){lastrowint=15;}if(lastrow.equals("R")){lastrowint=18;}

        String endingLetter="";
        String firstLetter="";


        int rownumber = Integer.parseInt(scanner.nextLine());
        int currentrow = 0;
        int oddrowseats = Integer.parseInt(scanner.nextLine());
        int seats;
        int totalseats = 0;

        for(int i=1; i<=lastrowint; i++){
            for(int j=1; j<=rownumber-1+i; j++){
                if(j%2==0){seats=oddrowseats+2;}
                else{seats=oddrowseats;}
                for(int k=1; k<=seats; k++){
                    totalseats++;
                    if(i==1){firstLetter="A";}if(i==2){firstLetter="B";}
                    if(i==3){firstLetter="C";}if(i==4){firstLetter="D";}
                    if(i==5){firstLetter="E";}if(i==6){firstLetter="F";}
                    if(i==7){firstLetter="G";}if(i==8){firstLetter="H";}
                    if(i==9){firstLetter="I";}if(i==10){firstLetter="J";}
                    if(i==11){firstLetter="K";}if(i==12){firstLetter="L";}
                    if(i==13){firstLetter="M";}if(i==14){firstLetter="N";}
                    if(i==15){firstLetter="O";}if(i==16){firstLetter="P";}
                    if(i==17){firstLetter="Q";}if(i==18){firstLetter="R";}
                    if(i==19){firstLetter="S";}if(i==20){firstLetter="T";}
                    if(i==21){firstLetter="U";}if(i==22){firstLetter="V";}
                    if(i==23){firstLetter="W";}if(i==24){firstLetter="X";}
                    if(i==25){firstLetter="Y";}if(i==26){firstLetter="Z";}

                    if(k==1){endingLetter="a";}if(k==2){endingLetter="b";}
                    if(k==3){endingLetter="c";}if(k==4){endingLetter="d";}
                    if(k==5){endingLetter="e";}if(k==6){endingLetter="f";}
                    if(k==7){endingLetter="g";}if(k==8){endingLetter="h";}
                    if(k==9){endingLetter="i";}if(k==10){endingLetter="j";}
                    if(k==11){endingLetter="k";}if(k==12){endingLetter="l";}
                    if(k==13){endingLetter="m";}if(k==14){endingLetter="n";}
                    if(k==15){endingLetter="o";}if(k==16){endingLetter="p";}
                    if(k==17){endingLetter="q";}if(k==18){endingLetter="r";}
                    if(k==19){endingLetter="s";}if(k==20){endingLetter="t";}
                    if(k==21){endingLetter="u";}if(k==22){endingLetter="v";}
                    if(k==23){endingLetter="w";}if(k==24){endingLetter="x";}
                    if(k==25){endingLetter="y";}if(k==26){endingLetter="z";}

                    System.out.println(firstLetter+""+j+""+endingLetter);

                }
            }

        }System.out.println(totalseats);




    }
}
