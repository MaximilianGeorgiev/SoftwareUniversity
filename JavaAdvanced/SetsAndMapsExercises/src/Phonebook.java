import java.util.HashMap;
import java.util.Scanner;

public class Phonebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        HashMap<String, String> phoneBook = new HashMap<>();
        Boolean isSearchTime = false;

        while (!input.equals("stop")) {
            if (input.equals("search")) {
                isSearchTime = true;
                input = scanner.nextLine();
                continue;
            }
            while (isSearchTime) {
                if (input.equals("stop")) {
                    return;
                }
                if (phoneBook.containsKey(input)) {
                    System.out.printf("%s -> %s%n", input, phoneBook.get(input));
                } else {
                    System.out.printf("Contact %s does not exist.%n", input);
                }
                input = scanner.nextLine();
            }
            if (!isSearchTime) {
                String[] inputSplit = input.split("-");

                if (!phoneBook.containsKey(input)) {
                    phoneBook.put(inputSplit[0], inputSplit[1]);
                }
            }
            input = scanner.nextLine();
        }
    }
}
