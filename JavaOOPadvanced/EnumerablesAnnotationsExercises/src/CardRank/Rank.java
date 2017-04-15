package CardRank;

/**
 * Created by 200sx on 4/12/2017.
 */
public enum Rank {
    ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING;

    @Override
    public String toString(){
        return String.format("Ordinal value: %d; Name value: %s", super.ordinal(), super.toString());
    }
}
