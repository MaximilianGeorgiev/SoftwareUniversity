import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        String input = inputScanner.nextLine();
        LinkedHashMap<String, Long> database = new LinkedHashMap<>();

        while (!input.equals("stop")) {
            Long quantity = Long.parseLong(inputScanner.nextLine());

            if (!database.containsKey(input)) {
                database.put(input, quantity);
            }

            else {
                Long currentQuantity = database.get(input);
                database.put(input, currentQuantity + quantity);
            }

            input = inputScanner.nextLine();
        }

        for (Map.Entry<String, Long> pair : database.entrySet()){
            System.out.printf("%s -> %d%n", pair.getKey(), pair.getValue());
        }
    }
}
