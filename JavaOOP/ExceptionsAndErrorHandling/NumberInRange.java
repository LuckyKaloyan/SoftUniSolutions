package SoftUniJavaOOP.OOP.ExceptionsAndErrorHandling;
import java.util.Arrays;
import java.util.Scanner;
public class NumberInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] minmax = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int min=minmax[0];
        int max=minmax[1];
        boolean foundit = false;
        System.out.println("Range: ["+min+"..."+max+"]");
        while(!foundit){
            String input = scanner.nextLine();
            try{
                if( Integer.parseInt(input)>=min && Integer.parseInt(input)<=max ){
                    System.out.println("Valid number: "+input);
                    scanner.close();
                    foundit=true;
                }else{
                    System.out.println("Invalid number: "+input);
                }
            }catch(Exception edae){
                System.out.println("Invalid number: "+input);
            }
        }
    }
}
