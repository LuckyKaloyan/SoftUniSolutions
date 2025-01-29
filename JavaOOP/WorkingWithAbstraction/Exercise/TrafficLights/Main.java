
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TrafficLights object = new TrafficLights(scanner.nextLine().split(" "),Integer.parseInt(scanner.nextLine()));
        object.print();
    }
}
