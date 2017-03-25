package Telephony;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * Created by 200sx on 3/18/2017.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));

        String[] numbers =scanner.readLine().split("\\s+");
        String[] URLs = scanner.readLine().split("\\s+");

        Smartphone smartphone = new Smartphone(numbers, URLs);

        smartphone.call();
        smartphone.browse();

    }
}
