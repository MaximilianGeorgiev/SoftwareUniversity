import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by sasaas on 26.1.2017 г..
 */
public class MathPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] children = scanner.nextLine().split(" ");
        int n = Integer.valueOf(scanner.nextLine());

        ArrayDeque<String> queue = new ArrayDeque<>();
        Collections.addAll(queue, children);

        int iteration = 1;
        boolean isPrime = true;

        while (queue.size() > 1) {
            for (int i = 1; i < n; i++) {
                queue.offer(queue.poll());
            }

            if (isPrime(iteration)) {
                System.out.printf("Prime %s%n", queue.peek());
            } else {
                System.out.printf("Removed %s%n", queue.poll());
            }
            iteration++;
        }
        System.out.printf("Last is %s%n", queue.poll());
    }

    private static boolean isPrime(int iteration) {
        if (iteration <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(iteration); i++) {
            if (iteration % i == 0) {
                return false;
            }
        }
        return true;
    }
}
