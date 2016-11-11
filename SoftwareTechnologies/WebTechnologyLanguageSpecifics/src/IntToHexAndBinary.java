import java.util.Scanner;

public class IntToHexAndBinary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int integer = Integer.parseInt(input.nextLine());
        System.out.println(Integer.toHexString(integer).toUpperCase());
        System.out.println(Integer.toBinaryString(integer));

    }
}
