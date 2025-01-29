package FundamentalsModule.MidExamPreparation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arrei = scanner.nextLine().split(" ");
        int total = 0;
        int average ;
        int count = 0;
        List<Integer> intarei = new ArrayList<>();
        for(int i=0; i<arrei.length; i++){
            intarei.add(Integer.parseInt(arrei[i]));
        }
        Collections.sort(intarei);
        List<Integer> sorted = new ArrayList<>();

        for(int i=arrei.length-1; i>=0; i--){
            sorted.add(intarei.get(i));
            total = total+ intarei.get(i);
        }
        average = total/arrei.length;
        for(int i=0; i<arrei.length; i++){
            if(sorted.get(i)>average){
                System.out.print(sorted.get(i) + " ");
                count++;
            }
            if(count>4){break;}
        }
        if(count==0){
            System.out.println("No");
        }
    }
}
