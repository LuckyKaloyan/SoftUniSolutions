package SoftUniJavaOOP.OOP.Encapsulation.Lab.FirstAndReverseTeam;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Team team = new Team("Black Eagle");
        int input = Integer.parseInt(scanner.nextLine());

        for(int i =0; i<input; i++){
            String[] line = scanner.nextLine().split(" ");
            Person player = new Person(line[0],line[1],Integer.parseInt(line[2]),Double.parseDouble(line[3]));
            team.addPlayer(player);
        }

        System.out.printf("First team have %d players%n", team.getFirstTeam().size());
        System.out.printf("Reverse team have %d players", team.getReserveTeam().size());


    }
}
