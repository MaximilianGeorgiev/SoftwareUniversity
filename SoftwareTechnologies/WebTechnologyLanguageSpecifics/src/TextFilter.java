import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextFilter {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        String[] bannedWords = inputScanner.nextLine().split(", ");
        String text = inputScanner.nextLine();

        for (String word : bannedWords) {

            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < word.length(); i++) {
                sb.append("*");

            }
            text = text.replaceAll(word, sb.toString());
        }

        System.out.println(text);
    }
}
