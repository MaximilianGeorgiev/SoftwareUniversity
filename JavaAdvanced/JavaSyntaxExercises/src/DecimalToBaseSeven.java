import java.util.Scanner;

public class DecimalToBaseSeven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputNumber = scanner.next();
        System.out.println(Long.parseLong(inputNumber, 7));
    }
}
