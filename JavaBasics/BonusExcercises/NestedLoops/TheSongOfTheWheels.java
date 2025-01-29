package EntryModule.BonusExcercises.NestedLoops;

import java.util.Scanner;

public class TheSongOfTheWheels {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int controlnumber = Integer.parseInt(scanner.nextLine());
        int count = 0;
        String saved4th = "";



        for(int i=1; i<=9; i++){
            for(int j=1; j<=9; j++){
                for(int h=1; h<=9; h++){
                    for(int o = 1; o<=9; o++){
                        if((o*h)+(j*i)==controlnumber && i<j && h>o){
                            System.out.print(i+""+j+""+h+""+o+" ");
                            count++;
                            if(count==4){saved4th="Password: "+i+""+j+""+h+""+o;}
                        }
                    }
                }
            }
        }
        if(count>=4){
            System.out.println();
            System.out.println(saved4th);
        }else{
            System.out.println();
            System.out.println("No!");
        }

    }
}
