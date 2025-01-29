package FundamentalsModule.DataTypes.Lab;

import java.util.Scanner;
public class RefactorVolumeOfPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Length: ");
        double dul = Double.parseDouble(scanner.nextLine());
        System.out.print("Width: ");
        double sh = Double.parseDouble(scanner.nextLine());
        System.out.print("Height: ");
        double V = Double.parseDouble(scanner.nextLine());
        System.out.printf("Pyramid Volume: %.2f", (dul * sh * V) / 3);

    }
}
