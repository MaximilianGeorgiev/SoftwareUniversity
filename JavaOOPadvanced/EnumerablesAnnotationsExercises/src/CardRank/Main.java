package CardRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by 200sx on 4/12/2017.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader scannner = new BufferedReader(new InputStreamReader(System.in));

        String randomInput = scannner.readLine();

        System.out.println("Card Ranks:");

        for (Rank rank : Rank.values()) {
            System.out.println(rank);
        }
    }
}
