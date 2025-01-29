package EntryModule.ConditionalStatements.Lab;

import java.util.Scanner;
public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String kiufte = scanner.nextLine();

        if (kiufte.equals("square")) {
            double kvadratnokiufte = Double.parseDouble(scanner.nextLine());
            System.out.println(kvadratnokiufte * kvadratnokiufte);
        }


        if (kiufte.equals("rectangle")) {
            double rectanglevokiufte1 = Double.parseDouble(scanner.nextLine());
            double rectanglevokiufte2 = Double.parseDouble(scanner.nextLine());
            System.out.println(rectanglevokiufte1 * rectanglevokiufte2);
        }

        if (kiufte.equals("circle")) {
            double circlevokiufte = Double.parseDouble(scanner.nextLine());
            System.out.println(circlevokiufte * circlevokiufte * Math.PI);
        }
        if (kiufte.equals("triangle")) {
            double trianglevokiufte = Double.parseDouble(scanner.nextLine());
            double trianglevokiufte2 = Double.parseDouble(scanner.nextLine());
            System.out.println(trianglevokiufte * (trianglevokiufte2 / 2));
        }
    }
}