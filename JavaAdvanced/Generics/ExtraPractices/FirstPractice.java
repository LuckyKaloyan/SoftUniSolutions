package SoftUniJavaOOP.JavaAdvanced.Generics.ExtraPractices;

import java.util.ArrayList;
import java.util.List;

public class FirstPractice {
    public static void main(String[] args) {

        List somelist = new ArrayList();
        somelist.add("Pesho");
        somelist.add("Gosho");
        somelist.add("Tosho");

        somelist.add(1);
        somelist.add(1.1);

        System.out.println(somelist);
    }
}
