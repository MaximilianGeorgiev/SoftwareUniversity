import java.util.Scanner;

public class CollectTheCoins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[][] matrix = new char[4][];

        for (int row = 0; row < 4; row++) {
            char[] input = scanner.nextLine().toCharArray();

            matrix[row] = new char[input.length];

            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = input[col];
            }
        }

        int currentRow = 0;
        int currentCol = 0;
        int coinsCollected = 0;
        int wallsHit = 0;

        if (String.valueOf(matrix[0][0]).equals("$")){
            coinsCollected++;
        }

        char[] commands = scanner.nextLine().toCharArray();

        for (int command = 0; command < commands.length; command++) {

            if (String.valueOf(commands[command]).equals("V")) {
                if (currentRow + 1 > matrix.length - 1) {
                    wallsHit++;
                    continue;
                }
                currentRow++;

                if ((currentRow < matrix.length - 1) &&
                        (String.valueOf(matrix[currentRow][currentCol]).equals("$"))) {
                    coinsCollected++;
                }
            } else if (String.valueOf(commands[command]).equals(">")) {
                if (currentCol + 1 > matrix[currentRow].length - 1) {
                    wallsHit++;
                    continue;
                }

                currentCol++;

                if ((currentCol < matrix[currentRow].length - 1) &&
                        (String.valueOf(matrix[currentRow][currentCol]).equals("$"))) {
                    coinsCollected++;
                }

            } else if (String.valueOf(commands[command]).equals("<")) {
                if (currentCol - 1 < 0) {
                    wallsHit++;
                    continue;
                }

                currentCol--;

                if ((currentCol >= 0) &&
                        (String.valueOf(matrix[currentRow][currentCol]).equals("$"))) {
                    coinsCollected++;
                }
            } else if (String.valueOf(commands[command]).equals("^")){
                if (currentRow - 1 < 0){
                    wallsHit++;
                    continue;
                }

                currentRow--;

                if((currentRow >= 0) && (String.valueOf(matrix[currentRow][currentCol]).equals("$"))){
                    coinsCollected++;
                }
            }
        }

        System.out.printf("Coins = %s%n", coinsCollected);
        System.out.printf("Walls = %s", wallsHit);
    }
}
