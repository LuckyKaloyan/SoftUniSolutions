package SoftUniJavaOOP.JavaAdvanced.Generics.Exercise.GenericSwapMethodStrings;

import java.util.*;

public class Main {
    public static <T> void swapElements(List<T> list, int index1, int index2) {
        if (index1 < 0 || index1 >= list.size() || index2 < 0 || index2 >= list.size()) {
            System.out.println("Invalid indices");
            return;
        }

        T temp = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2, temp);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Box<String>> boxes = new ArrayList<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            Box<String> box = new Box<>(input);
            boxes.add(box);
        }

        String[] swapCommand = scanner.nextLine().split("\\s+");
        int index1 = Integer.parseInt(swapCommand[0]);
        int index2 = Integer.parseInt(swapCommand[1]);

        swapElements(boxes, index1, index2);

        for (Box<String> box : boxes) {
            System.out.println(box.toString());
        }

        scanner.close();
    }
}
