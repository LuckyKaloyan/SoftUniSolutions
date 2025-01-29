package FundamentalsModule.Lists.Exercise;


import java.util.ArrayList;
import java.util.Scanner;

public class HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int commands = Integer.parseInt(scanner.nextLine());
        ArrayList<String> guests = new ArrayList<>();

        for (int i = 0; i < commands; i++) {
            String input = scanner.nextLine();
            String[] parts = input.split("\\s+");

            String name = parts[0];
            String status = parts[parts.length - 1].substring(0, parts[parts.length - 1].length() - 1);

            if (status.equals("going!")) {
                if (guests.contains(name)) {
                    System.out.println(name + " is already in the list!");
                } else {
                    guests.add(name);
                }
            } else if (status.equals("not")) {
                if (guests.contains(name)) {
                    guests.remove(name);
                } else {
                    System.out.println(name + " is not in the list!");
                }
            }
        }

        for (String guest : guests) {
            System.out.println(guest);
        }
    }
}
