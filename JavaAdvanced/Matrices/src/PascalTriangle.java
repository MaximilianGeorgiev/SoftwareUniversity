import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int height = scanner.nextInt();

        long[][] pascalMatrix = new long[height][];

        for (int i = 0; i < height; i++) {
            pascalMatrix[i] = new long[i + 1];
        }

        pascalMatrix[0][0] = 1;

        for (int row = 1; row < height; row++) {
            pascalMatrix[row][0] = 1;
            pascalMatrix[row][pascalMatrix[row].length - 1] = 1;

            for (int col = 1; col < pascalMatrix[row].length - 1; col++) {
                pascalMatrix[row][col] = pascalMatrix[row-1][col-1] + pascalMatrix[row-1][col];
            }
        }

        for (long[] ints : pascalMatrix) {
            for (long anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}
