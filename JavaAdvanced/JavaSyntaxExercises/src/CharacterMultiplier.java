import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String wordOne = scanner.next();
        String wordTwo = scanner.next();

        int asciSumOfCharacters = 0;

        for (int i = 0; i < Math.min(wordOne.length(), wordTwo.length()); i++) {
            asciSumOfCharacters += wordOne.charAt(i) * wordTwo.charAt(i);
        }

        if (wordOne.length() == wordTwo.length()) {
            System.out.println(asciSumOfCharacters);
            return;
        } else {
            if (wordOne.length() > wordTwo.length()) {
                for (int i = wordTwo.length(); i < wordOne.length() ; i++) {
                    asciSumOfCharacters += wordOne.charAt(i);
                }
            } else {
                for (int i = wordOne.length(); i < wordTwo.length() ; i++) {
                    asciSumOfCharacters += wordTwo.charAt(i);
                }
            }
        }
        System.out.println(asciSumOfCharacters);
    }
}

