import java.util.Scanner;

public class ParseTags {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        StringBuilder sb = new StringBuilder();
        sb.append(text);

        String upcase = "<upcase>";
        String closecase = "</upcase>";

        while (sb.toString().contains(upcase)) {
            int firstIndex = sb.indexOf(upcase);
            int secondIndex = sb.indexOf(closecase) + closecase.length();
            String targetedText = sb.substring(sb.indexOf(upcase) + upcase.length(), sb.indexOf(closecase));

            sb.replace(firstIndex, secondIndex, targetedText.toUpperCase());
        }
        System.out.println(sb.toString());
    }
}
