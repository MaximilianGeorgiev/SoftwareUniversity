import java.util.Scanner;

public class CalculateExpressions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double resultFormulaOne = Math.pow(((Math.pow(a, 2) + Math.pow(b, 2)) / (Math.pow(a, 2) - Math.pow(b, 2))),
                (a + b + c) / Math.sqrt(c)
        );

        double resultFormulaTwo = Math.pow((Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 3)), a - b);

        double averageValueOfNums = (a+b+c) / 3;
        double averageValueOfFormulae = (resultFormulaOne + resultFormulaTwo) / 2;

        double difference = Math.abs(averageValueOfFormulae - averageValueOfNums);


        System.out.printf("F1 result: %.2f; F2 result: %.2f; Diff: %.2f",
                resultFormulaOne, resultFormulaTwo, difference);


    }
}
