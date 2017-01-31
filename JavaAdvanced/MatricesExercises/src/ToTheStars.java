import java.util.Scanner;

public class ToTheStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Star[] stars = new Star[3];

        for (int i = 0; i < 3; i++) {
            String[] currentStarInfo = scanner.nextLine().split(" ");

            double x = Double.parseDouble(currentStarInfo[1]);
            double y = Double.parseDouble(currentStarInfo[2]);

            Star star = new Star();
            star.name = currentStarInfo[0];
            star.bottomY = y - 1;
            star.topY = y + 1;
            star.leftX = x - 1;
            star.rightX = x + 1;

            stars[i] = star;
        }

        String[] normandyStart = scanner.nextLine().split(" ");
        double normandyX = Double.parseDouble(normandyStart[0]);
        double normandyY = Double.parseDouble(normandyStart[1]);

        int positions = Integer.valueOf(scanner.nextLine());
        boolean hasEntered = false;

        for (int i = 0; i <= positions; i++) {
            for (Star star : stars) {
                if (normandyX >= star.leftX && normandyX <= star.rightX
                        && normandyY <= star.topY && normandyY >= star.bottomY) {
                    System.out.println(star.name.toLowerCase());
                    hasEntered = true;
                    break;
                }
            }
            if (!hasEntered) {
                System.out.println("space");
            }
            normandyY++;
            hasEntered = false;
        }
    }
}

class Star {
    String name;
    double bottomY;
    double topY;
    double leftX;
    double rightX;
}