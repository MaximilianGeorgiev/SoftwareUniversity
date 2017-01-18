import java.util.Scanner;

public class CalculateTriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double base = scanner.nextDouble();
        double height = scanner.nextDouble();
        double area = returnArea(base,height);
        System.out.printf("Area = %.2f", area);

    }
    public static double returnArea(double base, double height){
        return base * height / 2;
    }
}
