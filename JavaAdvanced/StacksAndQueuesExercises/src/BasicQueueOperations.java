import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        int numbersToAdd = Integer.valueOf(input[0]);
        int numbersToPoll = Integer.valueOf(input[1]);
        int numberToCheck = Integer.valueOf(input[2]);

        ArrayDeque<String> queue = new ArrayDeque<>();

        String[] numbers = scanner.nextLine().split(" ");
        Collections.addAll(queue, numbers);

        for (int i = 0; i < numbersToPoll; i++) {
            queue.poll();
        }

        if (!queue.isEmpty()){
            if(queue.contains(String.valueOf(numberToCheck))){
                System.out.println("true");
            } else {
                int minNum = Integer.MAX_VALUE;

                for (String s : queue) {
                    if (Integer.valueOf(s) < minNum){
                        minNum = Integer.valueOf(s);
                    }
                }
                System.out.println(minNum);
            }
        } else {
            System.out.println(0);
        }
    }
}
