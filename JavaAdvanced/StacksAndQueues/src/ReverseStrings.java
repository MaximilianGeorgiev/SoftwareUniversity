import java.util.ArrayDeque;
import java.util.Scanner;

public class ReverseStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();

        ArrayDeque<Character> stack = new ArrayDeque<>();

        for (char c : word.toCharArray()) {
            stack.push(c);
        }

        while (!stack.isEmpty()){
            System.out.print(stack.pop());
        }
    }
}
