package SoftUniJavaOOP.OOP.WorkingWithAbstraction.Exercise.CardRank;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Card Ranks:");
        for(CardRank rank: CardRank.values()){
            System.out.println("Ordinal value: "+rank.getOrdinalnumber()+"; Name value: "+rank.name());
        }
    }

}
