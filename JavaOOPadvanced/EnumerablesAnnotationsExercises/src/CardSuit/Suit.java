package CardSuit;

/**
 * Created by 200sx on 4/12/2017.
 */
public enum Suit {
    CLUBS, DIAMONDS, HEARTS, SPADES;

    @Override
    public String toString() {
        return String.format("Ordinal value: %d; Name value: %s", ordinal(), super.toString());

    }
}
