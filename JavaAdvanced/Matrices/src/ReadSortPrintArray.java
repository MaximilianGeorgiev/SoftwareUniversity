import java.util.Arrays;
import java.util.Scanner;

public class ReadSortPrintArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String[] input = new String[n];

        for (int i = 0; i < n; i++) {
          input[i] = scanner.nextLine();
        }

        Arrays.sort(input);

        for (String name : input) {
            System.out.println(name);
        }
    }
}
