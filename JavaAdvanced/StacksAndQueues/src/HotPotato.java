import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class HotPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] children = scanner.nextLine().split(" ");
        int n = Integer.valueOf(scanner.nextLine());

        ArrayDeque<String> queue = new ArrayDeque<>();
        Collections.addAll(queue, children);

        int iteration = 1;

        while (queue.size() > 1) {
            if (iteration == n) {
                System.out.printf("Removed %s%n", queue.poll());
                iteration = 1;
                continue;
            }
            String currentChild = queue.poll();
            queue.add(currentChild);

            iteration++;
        }
        System.out.printf("Last is %s%n", queue.poll());
    }
}
