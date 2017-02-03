import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountSameValuesInArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        HashMap<String, Integer> statistics = new HashMap<>();

        for (String s : input) {
            if (!statistics.containsKey(s)) {
                statistics.put(s, 1);
            } else {
                int currentCount = statistics.get(s);
                statistics.put(s, currentCount+1);
            }
        }
        for (Map.Entry<String, Integer> pair : statistics.entrySet()) {
            System.out.printf("%s - %d times%n", pair.getKey(), pair.getValue() );
        }
    }
}
