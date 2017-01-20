import java.util.Scanner;

public class OddAndEvenPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        if (input.length % 2 != 0){
            System.out.println("invalid length");
            return;
        }

        for (int i = 0; i < input.length; i += 2) {
            int currentNum = Integer.parseInt(input[i]);
            int nextNum = Integer.parseInt(input[i+1]);

            if (currentNum % 2 == 0 && nextNum % 2 ==0){
                System.out.printf("%d, %d -> both are even %n", currentNum, nextNum);
            } else if (currentNum % 2 != 0 && nextNum % 2 != 0) {
                System.out.printf("%d, %d -> both are odd %n", currentNum, nextNum);
            } else {
                System.out.printf("%d, %d -> different %n", currentNum, nextNum);
            }
        }
    }
}
