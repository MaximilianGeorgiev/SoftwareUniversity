import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class ReverseNumbersInStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputNumbers = scanner.nextLine().split(" ");
        ArrayDeque<String> reverser = new ArrayDeque<>();

        Collections.addAll(reverser, inputNumbers);

        while (!reverser.isEmpty()) {
            System.out.printf("%s ", reverser.pollLast());
        }
    }
}
