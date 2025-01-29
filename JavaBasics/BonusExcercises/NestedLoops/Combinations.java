package EntryModule.BonusExcercises.NestedLoops;

import java.util.Scanner;
public class Combinations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String first = scanner.nextLine();
        String last = scanner.nextLine();
        String miss = scanner.nextLine();

        int firstvalue= 0;
        int lastvalue= 0;
        boolean truth = true;
        int total =0;


        String[] array = new String[26];
        array[0]="a";
        array[1]="b";
        array[2]="c";
        array[3]="d";
        array[4]="e";
        array[5]="f";
        array[6]="g";
        array[7]="h";
        array[8]="i";
        array[9]="j";
        array[10]="k";
        array[11]="l";
        array[12]="m";
        array[13]="n";
        array[14]="o";
        array[15]="p";
        array[16]="q";
        array[17]="r";
        array[18]="s";
        array[19]="t";
        array[20]="u";
        array[21]="v";
        array[22]="w";
        array[23]="x";
        array[24]="y";
        array[25]="z";

        for(int i =0; i<=25; i++){
            if(first.equals(array[i])){firstvalue=i+1;}
            if(last.equals(array[i])){lastvalue=i+1;}
        }
        while(truth==true){
            for(int i=firstvalue-1; i<=lastvalue-1; i++){
                for(int j=firstvalue-1; j<=lastvalue-1; j++){
                    for(int k=firstvalue-1; k<=lastvalue-1; k++){
                        if(!array[i].equals(miss) && !array[j].equals(miss) && !array[k].equals(miss)){System.out.print(array[i]+array[j]+array[k]+" "); total++;}
                        if(i==k && k==j && j==lastvalue-1){truth=false;}
                    }if(truth==false){break;}
                }if(truth==false){break;}
            }if(truth==false){break;}
        }

        System.out.print(total);
    }
}
