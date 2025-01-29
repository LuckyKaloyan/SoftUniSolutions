package SoftUniJavaOOP.JavaAdvanced.Generics.ExtraPractices.Jar;

public class Main {
    public static void main(String[] args) {
        Jar<Integer> jarOfInts = new Jar<>();
        jarOfInts.add(1);
        jarOfInts.add(2);
        jarOfInts.add(3);


        while(!jarOfInts.getJar().isEmpty()){
            System.out.println(jarOfInts.remove());
        }
    }
}
