import java.util.Scanner;

public class NumbersInReversedOrder {
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);
        Double input = Double.parseDouble(inputReader.nextLine());
        System.out.println(ReturnReversed(input));
    }

    public static String ReturnReversed(Double input) {
        String reversedNumber = "";

        if (input % 2 == 0) {
            int nonDoubleInput = input.intValue();
            for (int i = Integer.toString(nonDoubleInput).length() - 1; i >= 0; i--) {
                reversedNumber += Integer.toString(nonDoubleInput).charAt(i);

            }

            return reversedNumber;
        } else {

            for (int i = Double.toString(input).length() - 1; i >= 0; i--) {
                reversedNumber += Double.toString(input).charAt(i);


            }

        }
        return reversedNumber;
    }
}

