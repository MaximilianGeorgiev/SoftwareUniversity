import java.util.ArrayDeque;
import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextLong();

        if (number == 0){
            System.out.println(number);
            return;
        }

        ArrayDeque<Long> stack = new ArrayDeque<>();

        while (number != 0){
            stack.push(number % 2);
            number /= 2;
        }

        for (Long binaryElement : stack) {
            System.out.print(binaryElement);
        }
    }
}
