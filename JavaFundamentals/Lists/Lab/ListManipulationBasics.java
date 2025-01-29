package FundamentalsModule.Lists.Lab;

import java.util.*;
import java.util.stream.Collectors;

public class ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = new ArrayList<>(Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList()));
        String word;
        int kokazako;
        int kokazako2;

        boolean iftrue = true;

        while (iftrue) {
            word = scanner.next();
            if (word.equals("Add")) {
                kokazako = scanner.nextInt();
                numbers.add(numbers.size(), kokazako);
            }

            if (word.equals("Remove")) {
                kokazako = scanner.nextInt();
                for (int i = 0; i < numbers.size(); i++) {
                    if (numbers.get(i) == kokazako) {
                        numbers.remove(i);
                        break;
                    }
                }
            }

            if (word.equals("RemoveAt")) {
                kokazako = scanner.nextInt();
                numbers.remove(kokazako);
            }
            if (word.equals("Insert")) {
                kokazako = scanner.nextInt();
                kokazako2 = scanner.nextInt();
                numbers.add(kokazako2, kokazako);


            }
            if (word.equals("end")) {
                iftrue = false;
            }


        }


        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i) + " ");
        }
    }
}