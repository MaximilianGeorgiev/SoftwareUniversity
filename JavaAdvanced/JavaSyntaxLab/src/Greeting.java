import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstLine = scanner.nextLine();
        String secondLine = scanner.nextLine();

        if (firstLine.equals("")) {
            firstLine = "*****";
        }

        if (secondLine.equals("")) {
            secondLine = "*****";
        }

        System.out.printf("Hello, %s %s!", firstLine, secondLine);
    }
}

