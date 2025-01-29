package FundamentalsModule.Arrays.MoreExercises;

import java.util.Arrays;
import java.util.Scanner;

public class LadyBugs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] field = new int[Integer.parseInt(scanner.nextLine())];
        int[] filled = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();


        for (int i = 0; i < filled.length; i++) {
            if (filled[i] >= 0 && filled[i] < field.length) {
                field[filled[i]] = 1;
            }
        }

        String word = "";
        while (!word.equals("end")) {
            word = scanner.nextLine();
            if (!word.equals("end")) {
                String[] moving = word.split(" ");
                int one = Integer.parseInt(moving[0]);
                String direction = moving[1];
                int distance = Integer.parseInt(moving[2]);


                if (one >= 0 && one < field.length && field[one] == 1) {
                    field[one] = 0;

                    int newPosition = direction.equals("right") ? one + distance : one - distance;

                    while (newPosition >= 0 && newPosition < field.length) {
                        if (field[newPosition] == 0) {
                            field[newPosition] = 1;
                            break;
                        }
                        newPosition = direction.equals("right") ? newPosition + distance : newPosition - distance;
                    }
                }
            }
        }

        for (int i = 0; i < field.length; i++) {
            System.out.print(field[i] + " ");
        }
    }
}
