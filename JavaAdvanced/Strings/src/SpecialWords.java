import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SpecialWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] specialWords = scanner.nextLine().split(" ");
        String[] text = scanner.nextLine().split(" ");

        HashMap<String, Integer> wordsCount = new HashMap<>();

        for (String specialWord : specialWords) {
            wordsCount.put(specialWord, 0);
        }

        for (String word : text) {
            for (String specialWord : specialWords) {
                if (word.equals(specialWord)){
                        wordsCount.put(specialWord, wordsCount.get(specialWord) + 1);
                }
            }
        }

        for (Map.Entry<String, Integer> word : wordsCount.entrySet()) {
            System.out.println(word.getKey() + " - " + word.getValue());
        }
    }
}
