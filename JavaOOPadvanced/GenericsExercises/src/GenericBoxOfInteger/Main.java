package GenericBoxOfInteger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by 200sx on 3/26/2017.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));

        Integer i = Integer.parseInt(scanner.readLine());
        Box box = new Box();

        for (int j = 0; j < i; j++) {
            box.add(Integer.parseInt(scanner.readLine()));
        }
        System.out.println(box.toString());
    }
}
