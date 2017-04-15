package CardsWithPower;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by 200sx on 4/12/2017.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));

        String rank = scanner.readLine();
        String suit = scanner.readLine();

        Rank rank1 = Rank.valueOf(rank);
        Suit suit1 = Suit.valueOf(suit);

        System.out.printf("Card name: %s of %s; Card power: %d", rank.toUpperCase(), suit.toUpperCase(),
                rank1.getPower() + suit1.getSuitPower());
    }
}
