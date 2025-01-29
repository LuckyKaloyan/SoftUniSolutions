package SoftUniJavaOOP.OOP.InterfacesAndAbstraction.Exercise.Telephony;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> phonebook = Arrays.asList(scanner.nextLine().split(" "));
        List<String> urlbook = Arrays.asList(scanner.nextLine().split(" "));

        Smartphone smartphone = new Smartphone(phonebook,urlbook);
        System.out.println(smartphone.browse());
        System.out.println(smartphone.call());

    }
}
