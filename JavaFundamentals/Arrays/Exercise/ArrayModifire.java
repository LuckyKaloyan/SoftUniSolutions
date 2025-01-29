package FundamentalsModule.Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;
public class ArrayModifire {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int index = 0;
        int index2 = 0;
        int swap;

        String input = "";
        while(!input.equals("end")){
            input = scanner.next();
            if(input.equals("end")){break;}

            if(input.equals("decrease")){
                for (int i=0; i<array.length; i++){
                    array[i]=array[i]-1;
                }
            }else{
                index = Integer.parseInt(scanner.next());
                index2 = Integer.parseInt(scanner.next());
            }


            if(input.equals("swap")){swap=array[index];
                array[index]=array[index2];
                array[index2]=swap;
            }
            if(input.equals("multiply")){
                array[index]=array[index]*array[index2];
            }

        }
        for(int i=0; i<array.length; i++){
            if(i+1!=array.length){ System.out.print(array[i]+", ");}
            else{
                System.out.print(array[i]);
            }

        }



    }
}
