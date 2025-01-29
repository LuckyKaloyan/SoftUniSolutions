package SoftUniJavaOOP.OOP.ExceptionsAndErrorHandling;
import java.util.Scanner;
public class SquareRoot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            try {
                int i = Integer.parseInt(scanner.nextLine());
                if(i>0) {
                    System.out.printf("%.2f" + System.lineSeparator(), Math.sqrt(i));
                }else{
                    System.out.println("Invalid");
                }
            }catch(Exception e){
                System.out.println("Invalid");
            }
        System.out.println("Goodbye");
    }
}
