package SoftUniJavaOOP.JavaAdvanced.Generics.Exercise.CustomListSorter;



import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CustomList<String> customList = new CustomList<>();
        String input = scanner.nextLine();
        while (!input.equals("END")) {
            String[] inputParts = input.split("\\s+");
            String command = inputParts[0];
            switch (command) {
                case "Add":
                    customList.add(inputParts[1]);
                    break;
                case "Remove":
                    customList.remove(Integer.parseInt(inputParts[1]));
                    break;
                case "Contains":
                    System.out.printf("%s%n", customList.contains(inputParts[1]));
                    break;
                case "Swap":
                    customList.swap(Integer.parseInt(inputParts[1]), Integer.parseInt(inputParts[2]));
                    break;
                case "Greater":
                    System.out.printf("%s%n", customList.countGreaterThan(inputParts[1]));
                    break;
                case "Max":
                    System.out.printf("%s%n", customList.getMax());
                    break;
                case "Min":
                    System.out.printf("%s%n", customList.getMin());
                    break;
                case "Sort":
                    Sorter.sort(customList);
                    break;
                case "Print":
                    customList.print();
                    break;
            }
            input = scanner.nextLine();
        }
    }
}
