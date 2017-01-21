import java.util.Scanner;

public class SumMatrixElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int rows = Integer.parseInt(input.split(", ")[0]);
        int columns = Integer.parseInt(input.split(", ")[1]);

        int[][] matrix = new int[rows][columns];

        for (int row = 0; row < matrix.length; row++) {
            String[] rowValues = scanner.nextLine().split(", ");

            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = Integer.parseInt(rowValues[column]);
            }
        }
        System.out.println(rows);
        System.out.println(columns);

        int allElementsValue = 0;

        for (int[] ints : matrix) {
            for (int colValue : ints) {
                allElementsValue += colValue;
            }
        }
        System.out.println(allElementsValue);
    }
}
