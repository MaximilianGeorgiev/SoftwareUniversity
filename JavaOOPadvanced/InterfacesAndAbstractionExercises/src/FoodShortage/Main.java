package FoodShortage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by 200sx on 3/23/2017.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(scanner.readLine());
        int totalFoodPurchased = 0;

        Map<String, Buyer> buyers = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String[] commandArgs = scanner.readLine().split("\\s+");

            if (commandArgs.length == 4) {
                buyers.put(commandArgs[0], new Citizen(commandArgs[0], Integer.parseInt(commandArgs[1]), commandArgs[2], commandArgs[3]));
            } else {
                buyers.put(commandArgs[0], new Rebel(commandArgs[0], Integer.parseInt(commandArgs[1]), commandArgs[2]));
            }
        }

        String transactions = scanner.readLine();

        while (!transactions.equals("End")) {
            if (buyers.containsKey(transactions)) {
                buyers.get(transactions).buyFood();
            }
            transactions = scanner.readLine();
        }

        for (Buyer buyer : buyers.values()) {
            totalFoodPurchased += buyer.getFood();
        }
        System.out.println(totalFoodPurchased);
    }
}
