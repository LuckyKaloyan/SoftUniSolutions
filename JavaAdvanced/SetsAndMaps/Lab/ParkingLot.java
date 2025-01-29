package AdvancedModule.SetsAndMaps.Lab;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
public class ParkingLot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(", ");
        Set<String> ParkingLot = new LinkedHashSet<>();
        while (!input[0].equals("END")) {
            if (input[0].equals("IN")) {
                ParkingLot.add(input[1]);
            }
            if (input[0].equals("OUT")) {
                ParkingLot.remove(input[1]);
            }
            input = scanner.nextLine().split(", ");
        }

        if (!ParkingLot.isEmpty()) {
            for (String a : ParkingLot) {
                System.out.println(a);
            }
        } else {
            System.out.println("Parking Lot is Empty");
        }
    }
}