import java.util.Scanner;

public class FormattingNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        double num2 = scanner.nextDouble();
        double num3 = scanner.nextDouble();

        String aHex = convertToHex(num1);
        String aBinary = convertToBinary(num1);

        String num2Formatted = String.format("%.2f", num2);
        String num3Formatted = String.format("%.3f", num3);

        int firstColumnSpaces = 10 - aHex.length();
        int thirdColumnSpaces = 10 - num2Formatted.length();
        int fourthColumnSpaces = 10 - num3Formatted.length();

        System.out.printf("|%s%" + firstColumnSpaces + "s|%s|%" + thirdColumnSpaces + "s%s|%s%" + fourthColumnSpaces + "s|",
                aHex, " ", aBinary, " ", num2Formatted, num3Formatted, " ");
    }

    public static String convertToHex(int a) {
        return Integer.toHexString(a).toUpperCase();
    }
    public static String convertToBinary(int a){
        return String.format("%10s", Integer.toBinaryString(a)).replace(' ', '0');
    }
}
