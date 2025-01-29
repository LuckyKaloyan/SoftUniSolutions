package FundamentalsModule.DataTypes.Exercise;

import java.util.*;
public class SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int capacity = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int days = 0;

        boolean readytogo = false;
        boolean used = false;

        while(!readytogo && capacity>=100) {

            used=true;
            sum = sum + capacity;
            if (sum >= 26) {sum = sum - 26;}
            capacity = capacity - 10;
            days++;

            if (capacity < 100) {
                readytogo = true;
                if (sum >= 26) {
                    sum = sum - 26;
                }
            }
        }
        if (used) {
            System.out.println(days);
            System.out.println(sum);
        } else { if(sum<=26){
            System.out.println(0);
            System.out.println(0);}
        }
    }
}