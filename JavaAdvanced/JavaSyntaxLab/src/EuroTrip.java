import java.math.BigDecimal;
import java.util.Scanner;

public class EuroTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double wurstKilos = scanner.nextDouble();
        BigDecimal exchangeRate = new BigDecimal("4210500000000");
        BigDecimal wurstValueExchanged = new BigDecimal(wurstKilos * 1.20);

        System.out.printf("%.2f marks", exchangeRate.multiply(wurstValueExchanged));
    }
}
