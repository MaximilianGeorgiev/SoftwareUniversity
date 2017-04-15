package CardSuit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by 200sx on 4/12/2017.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));

        String someInput = scanner.readLine();

        System.out.println("Card Suits:");

        for (Suit suit : Suit.values()) {
            System.out.println(suit);
        }
    }
}
