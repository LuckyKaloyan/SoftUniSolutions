package SoftUniJavaOOP.OOP.WorkingWithAbstraction.Exercise.CardsWithPower;

public enum CardsWithPower {



    ACE(14),
    KING(13),
    QUEEN(12),
    JACK(11),
    TEN(10),
    NINE(9),
    EIGHT(8),
    SEVEN(7),
    SIX(6),
    FIVE(5),
    FOUR(4),
    THREE(3),
    TWO(2),
    CLUBS(0),
    DIAMONDS(13),
    HEARTS(26),
    SPADES(39);
    public final int cardValue;

 CardsWithPower(int cardValue){
     this.cardValue = cardValue;
    }

    public int getCardValue() {
        return cardValue;
    }

}
