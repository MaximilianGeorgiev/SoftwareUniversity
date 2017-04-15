package CardGame;

import CardCompareTO.CardRank;
import CardCompareTO.CardSuit;

public class Card implements Comparable<Card> {

    private CardRank rank;
    private CardSuit suit;
    private int cardPower;

    public Card(String rank, String suit) {
        this.setRank(rank);
        this.setSuit(suit);

        this.calculateCardPower();
    }

    public CardRank getRank() {
        return this.rank;
    }

    private void setRank(String rank) {
        this.rank = CardRank.valueOf(rank);
    }

    public CardSuit getSuit() {
        return this.suit;
    }

    private void setSuit(String suit) {
        this.suit = CardSuit.valueOf(suit);
    }

    private void calculateCardPower() {
        this.cardPower = this.getRank().getPower() + this.getSuit().getPower();
    }

    public int getCardPower() {
        return this.cardPower;
    }

    @Override
    public String toString() {
        return String.format("Card name: %s of %s",
                this.getRank(), this.getSuit());
    }

    @Override
    public int compareTo(Card card) {
        return Integer.compare(this.getCardPower(), card.getCardPower());
    }
}