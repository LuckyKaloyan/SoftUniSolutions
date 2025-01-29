package FundamentalsModule.DataTypes.MoreExercises;

import java.util.Scanner;

public class FromLeftToRight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            double first = Double.parseDouble(scanner.next());
            double second = Double.parseDouble(scanner.next());

            long sum = 0;
            if (first > second) {
                long numFirst = (long)Math.abs(first);
                while (numFirst > 0) {
                    sum = sum+(numFirst % 10);
                    numFirst = numFirst/10;
                }
            } else {
                long numSecond = (long)Math.abs(second);
                while (numSecond > 0) {
                    sum =sum+(numSecond % 10);
                    numSecond = numSecond/10;
                }
            }
            System.out.println(Math.abs(sum));
        }
    }
}
