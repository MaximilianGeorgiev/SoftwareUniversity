import java.util.ArrayDeque;
import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] word = scanner.nextLine().toCharArray();
        ArrayDeque<Character> palindrome = new ArrayDeque<>();

        for (char c : word) {
            palindrome.add(c);
        }

        while (palindrome.size() > 1){
            char firstChar = palindrome.poll();
            char lastChar = palindrome.pollLast();

            if (firstChar != lastChar){
                System.out.println("false");
                return;
            }
        }
        System.out.println("true");
    }
}
