import java.util.Scanner;

public class TransportPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int distance = scanner.nextInt();
        double price = 0;
        String timeOfDay = scanner.next();

        if (distance < 20){
            price = 0.70 + 0.79 * distance;

            if (timeOfDay.toLowerCase().equals("night")){
                price = 0.70 + 0.90 * distance;
            }
        } else if (distance < 100) {
            price = 0.09 * distance;
        } else {
            price = 0.06 * distance;
        }

        System.out.printf("%.2f", price);
    }
}
