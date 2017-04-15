package DeckOfCards;

/**
 * Created by 200sx on 4/12/2017.
 */
public enum CardSuit {
    CLUBS(0), DIAMONDS(13), HEARTS(26), SPADES(39);

    private int suitPower;

    CardSuit(int suitPower){
        this.suitPower = suitPower;
    }

    public int getPower(){
        return this.suitPower;
    }
}
