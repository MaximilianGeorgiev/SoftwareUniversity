import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountSubstringOccurances {
    public static void main(String[] args) {

        Scanner inputScanner = new Scanner(System.in);
        String inputText = inputScanner.nextLine().toLowerCase();
        String patternInput = inputScanner.nextLine().toLowerCase();

        Pattern pattern = Pattern.compile(patternInput);
        Matcher matcher = pattern.matcher(inputText);

        int occurances = 0;
        int startIndex = 0;

        while (matcher.find(startIndex)) {
            occurances++;
            startIndex = matcher.start() + 1;
        }

        System.out.println(occurances);


    }
}
