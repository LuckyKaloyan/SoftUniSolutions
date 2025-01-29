package SoftUniJavaOOP.OOP.WorkingWithAbstraction.Exercise.CardSuit;

public class Main {
    public static void main(String[] args) {
        System.out.println("Card Suits:");
        for(CardSuit suit: CardSuit.values()){
            System.out.println("Ordinal value: "+suit.getOrdinalvalue()+"; Name value: "+suit.getSuit());
        }
    }
}
