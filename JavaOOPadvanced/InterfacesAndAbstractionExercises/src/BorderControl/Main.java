package BorderControl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by 200sx on 3/18/2017.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<BaseIntruder> intruders = new ArrayList<>();

        String input = scanner.readLine();

        while (!input.equals("End")) {
            String[] inputArgs = input.split("\\s+");

            if (inputArgs.length == 2) {
                intruders.add(new Robot(inputArgs[0], inputArgs[1]));
            } else {
                intruders.add(new Citizen(inputArgs[0], Integer.parseInt(inputArgs[1]), inputArgs[2]));
            }

            input = scanner.readLine();
        }

        String endsWith = scanner.readLine();

        for (BaseIntruder intruder : intruders) {
            if (intruder.getId().endsWith(endsWith)) {
                System.out.println(intruder.getId());
            }
        }
    }
}
