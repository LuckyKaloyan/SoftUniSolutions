package FundamentalsModule.DataTypes.Lab;

import java.util.Scanner;
public class CenturiesToMinutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double input = Double.parseDouble(scanner.nextLine());
        double years = input*100;
        double days = years*365.2422;
        double hourss = days*24;
        double minutess = hourss*60;
        System.out.printf("%.0f centuries = %.0f years = %.0f days = %.0f hours = %.0f minutes",input,
                years, days , hourss, minutess);

    }
}
