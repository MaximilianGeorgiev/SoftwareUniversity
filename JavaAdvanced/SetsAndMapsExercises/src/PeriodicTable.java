import java.util.*;

public class PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TreeSet<String> periodicTable = new TreeSet<>();
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");

            for (String s : input) {
                periodicTable.add(s);
            }
        }
        for (String s : periodicTable) {
            System.out.printf("%s ", s);
        }
    }
}
