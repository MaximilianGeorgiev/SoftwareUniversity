import java.util.Scanner;

public class VariableInHexFormat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String hexValue = input.nextLine().substring(2);
        int decimalValue = Integer.parseInt(hexValue, 16);
        System.out.println(decimalValue);

    }
}
