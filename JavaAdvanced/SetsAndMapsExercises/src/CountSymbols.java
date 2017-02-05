import sun.reflect.generics.tree.Tree;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] input = scanner.nextLine().toCharArray();

        TreeMap<Character, Long> log = new TreeMap<>();

        for (char c : input) {
            if (!log.containsKey(c)) {
                log.put(c, 1L);
            } else {
                long currentCount = log.get(c);
                log.put(c, currentCount + 1);
            }
        }
        for (Map.Entry<Character, Long> characterLongEntry : log.entrySet()) {
            System.out.printf("%s: %d time/s%n", characterLongEntry.getKey(), characterLongEntry.getValue());
        }
    }
}
