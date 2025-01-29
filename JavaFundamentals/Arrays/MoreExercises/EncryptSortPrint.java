package FundamentalsModule.Arrays.MoreExercises;

import java.util.Scanner;
public class EncryptSortPrint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int times = Integer.parseInt(scanner.nextLine());
        String[] stringarray = new String[times];
        for(int i=0; i<times; i++){
            stringarray[i]= scanner.nextLine();
        }
        int[] intarray = new int[times];
        int temporary;



        for(int i=0; i<times; i++){
            for(int j=0; j<stringarray[i].length(); j++){
                if(stringarray[i].charAt(j)=='U' || stringarray[i].charAt(j)=='u'|| stringarray[i].charAt(j)=='A'
                        || stringarray[i].charAt(j)=='a' || stringarray[i].charAt(j)=='E' || stringarray[i].charAt(j)=='e'
                        || stringarray[i].charAt(j)=='i' || stringarray[i].charAt(j)=='I' || stringarray[i].charAt(j)=='o'
                        || stringarray[i].charAt(j)=='O'){

                    intarray[i]=intarray[i]+(stringarray[i].charAt(j))*stringarray[i].length();
                }
                else{intarray[i]=intarray[i]+(stringarray[i].charAt(j))/stringarray[i].length();}
            }
        }


        for(int i=0; i<times-1; i++){
            for(int j=0; j<times-1; j++)
            {
                for(int h=0; h<times-1; h++) {
                    if(intarray[h]>intarray[h+1]){
                        temporary=intarray[h];
                        intarray[h]=intarray[h+1];
                        intarray[h+1]=temporary;
                    }
                }
            }
        }
        for (int i=0; i<times; i++){
            System.out.println(intarray[i]);
        }



    }
}
