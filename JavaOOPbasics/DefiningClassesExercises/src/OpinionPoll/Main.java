package OpinionPoll;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(scanner.readLine());

        ArrayList<Person> people = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.readLine().split("\\s+");
            Person person = new Person(input[0], Integer.parseInt(input[1]));
            people.add(person);
        }

        people.stream()
                .filter(age -> (age.age > 30))
                .sorted((a,b) -> a.name.compareTo(b.name))
                .forEach(x -> System.out.printf("%s - %d%n", x.name, x.age));
    }
}
