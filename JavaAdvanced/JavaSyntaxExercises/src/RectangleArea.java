import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        double rectangleArea = a * b;
        System.out.printf("%.2f", rectangleArea);
    }
}
