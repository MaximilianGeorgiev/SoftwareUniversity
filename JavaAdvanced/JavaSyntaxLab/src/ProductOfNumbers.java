import java.math.BigInteger;
import java.util.Scanner;

public class ProductOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long startNum = scanner.nextInt();
        long endNum = scanner.nextInt();

        long startNumPreversed = startNum;
        BigInteger result = new BigInteger("1");

        for (long i = startNum; i <= endNum ; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        System.out.printf("product[%d..%d] = %d", startNumPreversed, endNum, result);
    }
}
