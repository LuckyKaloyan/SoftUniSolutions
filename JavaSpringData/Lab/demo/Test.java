import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int total = 0;
        int Nefrit = 3070;
        for(int i = 611; i<=1000; i++){
            Nefrit = Nefrit+5;
            total = total+Nefrit;
        }
        System.out.println(total);




    }
}
