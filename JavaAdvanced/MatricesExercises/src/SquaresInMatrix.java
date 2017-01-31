import java.util.Scanner;

public class SquaresInMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int rows = Integer.parseInt(input.split(" ")[0]);
        int cols = Integer.parseInt(input.split(" ")[1]);

        String[][] matrix = new String[rows][cols];

        for (int row = 0; row < rows; row++) {
            String[] colValues = scanner.nextLine().split(" ");

            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = colValues[col];
            }
        }

        int subRowsCount = 0;

        for (int row = 0; row < matrix.length - 1; row++) {
            for (int col = 0; col < matrix[row].length - 1; col++) {
                String word = matrix[row][col];

                if (matrix[row][col+1].equals(word) && matrix[row+1][col].equals(word)
                        && matrix[row+1][col+1].equals(word)){
                    subRowsCount++;
                }

            }
        }
        System.out.println(subRowsCount);
    }
}
