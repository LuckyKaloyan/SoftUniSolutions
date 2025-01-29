package EntryModule.BonusExcercises.NestedLoops;

import java.util.Scanner;
public class HappyNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());
        String first = "";
        int firstint ;
        String second = "";
        int secondint ;
        String third = "";
        int thirdint ;
        String fourth = "";
        int fourthint ;
        int firsttwo;
        int secondtwo;
        for(int i=1000; i<=9999; i++){
            first = String.valueOf(String.valueOf(i).charAt(0));
            second = String.valueOf(String.valueOf(i).charAt(1));
            third = String.valueOf(String.valueOf(i).charAt(2));
            fourth = String.valueOf(String.valueOf(i).charAt(3));

            firsttwo = Integer.parseInt(String.valueOf(i).substring(0,2));
            secondtwo = Integer.parseInt(String.valueOf(i).substring(2,4));


            fourthint = Integer.parseInt(fourth);
            thirdint = Integer.parseInt(third);
            secondint = Integer.parseInt(second);
            firstint = Integer.parseInt(first);



            if(firstint+secondint==thirdint+fourthint && input%(firstint+secondint)==0 &&(firstint!=0 && secondint!=0 && thirdint!=0 && fourthint!=0)){
                System.out.print(i+" ");
            }


        }



    }
}
