import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class MaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.valueOf(scanner.nextLine());

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        ArrayDeque<Integer> maxValues = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            String command = scanner.nextLine();

            if (command.charAt(0) == '1'){
                int currentNum = Integer.valueOf(command.split(" ")[1]);
                stack.push(currentNum);

                if (!maxValues.isEmpty()) {
                    if (currentNum > Collections.max(maxValues)) {
                        maxValues.push(currentNum);
                    }
                } else {
                    maxValues.push(currentNum);
                }

            } else if (command.equals("2")){
                if (maxValues.contains(stack.peek())){
                    maxValues.remove();
                }

                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else if (command.equals("3")){
                if (!maxValues.isEmpty()) {
                    System.out.println(Collections.max(maxValues));
                } else {
                    System.out.println(0);
                }
            }
        }
    }
}
