package GenericCountMethodStrings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


/**
 * Created by 200sx on 3/27/2017.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(scanner.readLine());

        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(scanner.readLine());
        }

        System.out.println(Box.getCountOfGreater(list, scanner.readLine()));
    }
}
