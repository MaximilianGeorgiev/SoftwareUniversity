import java.util.Scanner;

public class GameOfNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int participantsCount = scanner.nextInt();

        int latestHighScore = Integer.MIN_VALUE;
        String latestName = "";

        for (int i = 0; i < participantsCount; i++) {
            String name = scanner.next();
            int score = scanner.nextInt();

           for (char character : name.toCharArray()) {
               if (character % 2 == 0) {
                   score += character;
               } else {
                   score -= character;
               }
           }
            if (score > latestHighScore){
                latestHighScore = score;
                latestName = name;
            }
        }
        System.out.printf("The winner is %s - %d points", latestName, latestHighScore);
    }
}
