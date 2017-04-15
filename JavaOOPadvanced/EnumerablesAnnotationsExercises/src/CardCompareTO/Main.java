package CardCompareTO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String rank = reader.readLine();
        String suit = reader.readLine();


        String secondRank = reader.readLine();
        String secondSuit = reader.readLine();

        Card card = new Card(rank, suit);
        Card card2 = new Card(secondRank, secondSuit);

        if (card.compareTo(card2) > 0) {
            System.out.println(card);
        } else {
            System.out.println(card2);
        }
    }
}