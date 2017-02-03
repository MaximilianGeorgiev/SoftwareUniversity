import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class AcademyGraduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.valueOf(scanner.nextLine());
        TreeMap<String, Double> grades = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            String[] currentGrades = scanner.nextLine().split(" ");

            double averageGrade = 0;

            for (String currentGrade : currentGrades) {
                averageGrade += Double.parseDouble(currentGrade);
            }
            grades.put(name, averageGrade / currentGrades.length);
        }

        for (Map.Entry<String, Double> student : grades.entrySet()) {
            System.out.printf("%s is graduated with " + student.getValue() + "%n", student.getKey());
        }
    }
}

