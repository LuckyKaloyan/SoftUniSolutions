package FundamentalsModule.Lists.Lab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class ListOfProducts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int times = Integer.parseInt(scanner.nextLine());
        ArrayList<String> lista = new ArrayList<>();

        for(int i=0; i<times; i++){
            lista.add(i, scanner.nextLine());
        }
        Collections.sort(lista);

        for(int i=0; i<lista.size(); i++){
            System.out.print(i+1+"."+lista.get(i));
            System.out.println();
        }


    }
}
