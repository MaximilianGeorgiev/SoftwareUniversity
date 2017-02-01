import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class SimpleCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] expression = scanner.nextLine().split(" ");

        ArrayDeque<String> stack = new ArrayDeque<>();
        Collections.addAll(stack, expression);

        while (stack.size() > 1){
            int first = Integer.valueOf(stack.pop());
            String sign = stack.pop();
            int second = Integer.valueOf(stack.pop());

            if(sign.equals("+")){
                stack.push(String.valueOf(first+second));
            } else if (sign.equals("-")){
                stack.push(String.valueOf(first-second));
            }
        }

        System.out.println(stack.pop());
    }
}

