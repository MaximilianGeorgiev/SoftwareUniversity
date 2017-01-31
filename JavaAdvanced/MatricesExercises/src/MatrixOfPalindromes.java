import java.util.Scanner;

public class MatrixOfPalindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = scanner.nextInt();
        int cols = scanner.nextInt();

        String[][] matrix = new String[rows][cols];
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                String word = String.valueOf(alphabet[row]) +String.valueOf(alphabet[row+col]) + String.valueOf(alphabet[row]) ;
                matrix[row][col] = word;
            }
        }

        for (String[] strings : matrix) {
            for (String string : strings) {
                System.out.print(string + " ");
            }
            System.out.println();
        }
    }
}
