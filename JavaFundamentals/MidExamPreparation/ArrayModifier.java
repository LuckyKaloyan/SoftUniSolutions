package FundamentalsModule.MidExamPreparation;

import java.util.Scanner;
public class ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arrei = scanner.nextLine().split(" ");
        int[] arreiInt = new int[arrei.length];
        for(int i=0; i<arrei.length; i++) arreiInt[i] = Integer.parseInt(arrei[i]);
        int temporary;
        String command = "";
        while(!command.equals("end")){
            command = scanner.nextLine();
            String[]splitted = command.split(" ");
            if(splitted.length==1){
                if(splitted[0].equals("end")){break;
                }else{
                    for(int i=0; i<arreiInt.length; i++){
                        arreiInt[i]=arreiInt[i]-1;
                    }
                }
            }
            if(splitted[0].equals("swap")){
                temporary = arreiInt[Integer.parseInt(splitted[1])];
                arreiInt[Integer.parseInt(splitted[1])] = arreiInt[Integer.parseInt(splitted[2])];
                arreiInt[Integer.parseInt(splitted[2])] = temporary;
            }
            if(splitted[0].equals("multiply")){
                arreiInt[Integer.parseInt(splitted[1])] = arreiInt[Integer.parseInt(splitted[1])]*arreiInt[Integer.parseInt(splitted[2])];
            }
        }
        if(arreiInt.length>0){
            System.out.print(arreiInt[0]);
        }
        for(int i=1; i<arreiInt.length; i++){
            System.out.print(", "+arreiInt[i]);
        }
    }
}
