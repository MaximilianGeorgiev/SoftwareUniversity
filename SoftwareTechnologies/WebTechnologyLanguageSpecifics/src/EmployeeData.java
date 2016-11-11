import java.util.Scanner;

public class EmployeeData {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String firstName = input.nextLine();
        String lastName = input.nextLine();
        int age = Integer.parseInt(input.nextLine());
        String gender = input.nextLine();
        String personalID = input.nextLine();
        String uniqueNumber = input.nextLine();

        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Personal ID: " + personalID);
        System.out.println("Unique Employee number: " + uniqueNumber);

    }
}
