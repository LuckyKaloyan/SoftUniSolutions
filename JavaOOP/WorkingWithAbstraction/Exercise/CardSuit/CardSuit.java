package SoftUniJavaOOP.OOP.WorkingWithAbstraction.Exercise.CardSuit;

public enum CardSuit {
    CLUBS("CLUBS",0),
    DIAMONDS("DIAMONDS",1),
    HEARTS("HEARTS",2),
    SPADES("SPADES",3);

    private final String suit;
    private final int ordinalvalue;

    public String getSuit() {
        return suit;
    }

    public int getOrdinalvalue() {
        return ordinalvalue;
    }

    CardSuit(String suit, int ordinalvalue){
        this.suit = suit;
        this.ordinalvalue = ordinalvalue;
    }





}
