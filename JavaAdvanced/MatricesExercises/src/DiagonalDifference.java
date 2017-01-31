import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[number][number];

        for (int row = 0; row < number; row++) {
            String[] colValues = scanner.nextLine().split(" ");

            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = Integer.parseInt(colValues[col]);
            }
        }

        int diagonalValue = 0;
        int secondDiagonalValue = 0;
        int multiplier = 0;
        boolean passedRow = false;


        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (!passedRow) {
                    diagonalValue += matrix[row][multiplier];
                    passedRow = true;
                }
            }
            passedRow = false;
            multiplier++;
        }

        multiplier = matrix.length - 1;

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (!passedRow) {
                    secondDiagonalValue += matrix[row][multiplier];
                    passedRow = true;
                }
            }
            passedRow = false;
            multiplier--;
        }


        System.out.println(Math.abs(secondDiagonalValue - diagonalValue));
    }
}
