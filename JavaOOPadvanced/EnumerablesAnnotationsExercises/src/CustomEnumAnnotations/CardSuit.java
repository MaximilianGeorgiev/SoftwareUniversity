package CustomEnumAnnotations;

/**
 * Created by 200sx on 4/12/2017.
 */
@Custom(type = "Enumeration", category = "Suit", description = "Provides rank constants for a Card class.")
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
