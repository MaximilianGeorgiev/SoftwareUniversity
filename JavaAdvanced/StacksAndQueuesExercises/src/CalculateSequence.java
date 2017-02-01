import java.util.ArrayDeque;
import java.util.Scanner;

public class CalculateSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long n = Long.valueOf(scanner.nextLine());

        ArrayDeque<Long> queue = new ArrayDeque<>();
        queue.add(n);

        for (int i = 0; i < 50; i++) {
            long S1 = queue.poll();
            long S2 = S1 + 1;
            long S3 = 2*S1 + 1;
            long S4 = S1 + 2;

            System.out.printf("%d ", S1);

            queue.add(S2);
            queue.add(S3);
            queue.add(S4);
        }

    }
}
