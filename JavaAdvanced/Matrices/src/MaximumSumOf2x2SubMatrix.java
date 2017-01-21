import java.util.Scanner;

public class MaximumSumOf2x2SubMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int rows = Integer.parseInt(input.split(", ")[0]);
        int cols = Integer.parseInt(input.split(", ")[1]);

        int[][] matrix = new int[rows][cols];

        for (int row = 0; row < matrix.length; row++) {
            String[] rowValues = scanner.nextLine().split(", ");

            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = Integer.parseInt(rowValues[col]);
            }
        }

        int sum = 0;
        int maxSum = Integer.MIN_VALUE;

        int[][] subMatrix = new int[2][2];

        for (int row = 0; row < rows - 1; row++) {
            for (int col = 0; col < cols - 1; col++) {
                sum = matrix[row][col] + matrix[row][col + 1] + matrix[row + 1][col] + matrix[row + 1][col + 1];

                int count = 0;

                if (sum > maxSum) {
                    int[] subMatrixElements = new int[]{matrix[row][col], matrix[row][col + 1], matrix[row + 1][col], matrix[row + 1][col + 1]};

                    maxSum = sum;
                    sum = 0;

                    for (int subRow = 0; subRow < 2; subRow++) {
                        for (int subCol = 0; subCol < 2; subCol++) {
                            subMatrix[subRow][subCol] = subMatrixElements[count];
                            count++;
                        }
                    }
                }
            }
        }

        for (int row = 0; row < subMatrix.length; row++) {
            for (int column = 0; column < subMatrix[0].length; column++) {
                System.out.print(subMatrix[row][column] + " ");
            }
            System.out.println();
        }
        System.out.println(maxSum);
    }
}

