package SoftUniJavaOOP.OOP.Inheritance.Lab.RandomArrayList;

import java.util.Random;

public class Main {
    public static void main(String[] args) {


        RandomArrayList<String> array = new RandomArrayList<>();

        array.add("1");
        array.add("2");
        array.add("3");

        System.out.println(array.getRandomElement());
    }
}
