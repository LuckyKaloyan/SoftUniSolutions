package EntryModule.BonusExcercises.NestedLoops;

import java.util.Scanner;
public class NumericValue {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int maxgen = Integer.parseInt(scanner.nextLine());
        int generated = 0;
        boolean endpoint = true;

        char c= (char)(a);

        while(generated<maxgen){
            for(int i=35; i<=56; i++){

                for(int j=64; j<=97;j++){

                    for(int x=1; x<=a; x++){
                        for(int y=1; y<=b; y++){
                            System.out.print(String.valueOf((char)(i))+String.valueOf((char)(j))+String.valueOf(x)+String.valueOf(y)+
                                    String.valueOf((char)(j))+String.valueOf((char)(i))+"|");
                            generated++;
                            i++;
                            if(i>55){i=35;}
                            j++;
                            if(j>96){j=64;}
                            if(y==b && x==a){endpoint=false;}
                            if(generated==maxgen){break;}
                        }if(generated==maxgen){break;}if(!endpoint){break;}
                    }if(generated==maxgen){break;}if(!endpoint){break;}
                }if(generated==maxgen){break;}if(!endpoint){break;}
            }if(generated==maxgen){break;}if(!endpoint){break;}
            generated++;
        }
    }
}
