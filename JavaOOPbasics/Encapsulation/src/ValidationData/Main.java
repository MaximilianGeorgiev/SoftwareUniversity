package ValidationData;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by 200sx on 2/26/2017.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(scanner.readLine());
        ArrayList<Person> people = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.readLine().split("\\s+");
            Person currentPerson = new Person();

            try {
                currentPerson.setFirstName(input[0]);
            } catch (IllegalArgumentException ex){
                System.out.println(ex.getMessage());
                continue;
            }

            try {
                currentPerson.setLastName(input[1]);
            } catch (IllegalArgumentException ex){
                System.out.println(ex.getMessage());
                continue;
            }

            try {
                currentPerson.setAge(Integer.parseInt(input[2]));
            } catch (IllegalArgumentException ex){
                System.out.println(ex.getMessage());
                continue;
            }

            try {
                currentPerson.setSalary(Double.parseDouble(input[3]));
            }catch (IllegalArgumentException ex){
                System.out.println(ex.getMessage());
                continue;
            }

            people.add(currentPerson);
        }

        int bonus = Integer.parseInt(scanner.readLine());

        for (Person person : people) {
            person.increaseSalary(bonus);
            System.out.println(person);
        }
    }
}
