package FundamentalsModule.DataTypes.Lab;

import java.util.*;
public class TownInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Town %s has population of %d and area %d square km.", scanner.nextLine(),
                Integer.parseInt(scanner.nextLine()), Integer.parseInt(scanner.nextLine()));
    }
}
