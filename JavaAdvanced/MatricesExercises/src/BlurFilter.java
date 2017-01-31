import java.util.Scanner;

public class BlurFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int blur = Integer.parseInt(scanner.nextLine());
        String[] matrixParams = scanner.nextLine().split(" ");

        int rows = Integer.parseInt(matrixParams[0]);
        int cols = Integer.parseInt(matrixParams[1]);

        long[][] matrix = new long[rows][cols];

        for (int row = 0; row < rows; row++) {
            String[] colValues = scanner.nextLine().split(" ");

            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = Integer.parseInt(colValues[col]);
            }
        }

        String[] coordinates = scanner.nextLine().split(" ");
        int targetRow = Integer.parseInt(coordinates[0]);
        int targetCol = Integer.parseInt(coordinates[1]);

        int leftBoundary = Math.max(0, targetCol - 1);
        int rightBoundary = Math.min(targetCol + 1, cols);
        int topBoundary = Math.max(0, targetRow - 1);
        int bottomBoundary = Math.min(targetRow + 1, rows);

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if ((leftBoundary <= col && col <= rightBoundary) &&
                        (topBoundary <= row && row <= bottomBoundary)) {
                    System.out.printf("%d ", matrix[row][col] + blur);
                } else {
                    System.out.printf("%d ", matrix[row][col]);
                }
            }
            System.out.println();
        }
    }
}
