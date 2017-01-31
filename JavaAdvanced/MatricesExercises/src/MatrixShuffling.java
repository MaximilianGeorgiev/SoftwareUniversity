import java.util.Scanner;

public class MatrixShuffling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] matrixParams = scanner.nextLine().split(" ");
        int rows = Integer.parseInt(matrixParams[0]);
        int cols = Integer.parseInt(matrixParams[1]);

        String[][] matrix = new String[rows][cols];

        for (int row = 0; row < rows; row++) {
            String[] colParams = scanner.nextLine().split(" ");

            for (int col = 0; col < cols; col++) {
                matrix[row][col] = colParams[col];
            }
        }

        String command = scanner.nextLine();

        while (!command.equals("END")) {
            String[] commandElements = command.split(" ");

            if (commandElements.length != 5 || (!commandElements[0].equals("swap"))) {
                System.out.println("Invalid input!");
                command = scanner.nextLine();
                continue;
            }

            int row1 = Integer.parseInt(commandElements[1]);
            int col1 = Integer.parseInt(commandElements[2]);
            int row2 = Integer.parseInt(commandElements[3]);
            int col2 = Integer.parseInt(commandElements[4]);

            boolean isInvalidCoordinate = row1 > matrix.length
                    || row1 < 0
                    || row2 > matrix.length
                    || row2 < 0
                    || col1 > matrix[row1].length
                    || col2 > matrix[row2].length
                    || col2 < 0;

            if (isInvalidCoordinate){
                System.out.println("Invalid input!");
                command = scanner.nextLine();
                continue;
            }

            String firstElement = matrix[row1][col1];
            String secondElement = matrix[row2][col2];

            matrix[row1][col1] = secondElement;
            matrix[row2][col2] = firstElement;
            printMatrix(matrix);

            command = scanner.nextLine();
        }
    }

    private static void printMatrix(String[][] matrix) {
        for (String[] string : matrix) {
            for (String str : string) {
                System.out.print(str + " ");
            }
            System.out.println();
        }
    }
}
