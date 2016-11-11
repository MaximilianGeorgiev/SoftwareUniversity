import java.util.Scanner;

public class SumReversedNumbers {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        String[] input = inputScanner.nextLine().split(" ");
        int[] numberReversed = new int[input.length];

        for (int i = 0; i < input.length; i++){
            StringBuilder sb = new StringBuilder();
            sb.append(input[i]);
            sb.reverse();

            numberReversed[i] = Integer.parseInt(sb.toString());
        }

        int sum = 0;
        for (int number : numberReversed){
            sum += number;
        }

        System.out.println(sum);
    }
}