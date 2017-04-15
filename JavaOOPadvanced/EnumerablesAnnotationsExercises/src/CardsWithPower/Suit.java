package CardsWithPower;

/**
 * Created by 200sx on 4/12/2017.
 */
public enum Suit {
    CLUBS(0), DIAMONDS(13), HEARTS(26), SPADES(39);

    private int suitPower;

    Suit(int suitPower){
        this.suitPower = suitPower;
    }

    public int getSuitPower(){
        return this.suitPower;
    }
}
