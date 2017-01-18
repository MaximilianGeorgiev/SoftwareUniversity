import java.util.Scanner;

public class ReadInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstWord = scanner.next();
        String secondWord = scanner.next();

        int firstNum = scanner.nextInt();
        int secondNum = scanner.nextInt();
        int thirdNum = scanner.nextInt();

        String finalWord = scanner.next();

        System.out.printf("%s %s %s %d", firstWord, secondWord, finalWord, firstNum + secondNum + thirdNum);
    }
}
