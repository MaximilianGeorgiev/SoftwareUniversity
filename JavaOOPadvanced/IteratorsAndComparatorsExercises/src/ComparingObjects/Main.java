package ComparingObjects;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by 200sx on 4/2/2017.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Person> people = new ArrayList<>();

        String command = scanner.nextLine();

        while (!command.equals("END")){
            String[] commandArgs = command.split("\\s+");
            people.add(new Person(commandArgs[0], Integer.parseInt(commandArgs[1]), commandArgs[2]));

            command = scanner.nextLine();
        }

        int numberOfEqualPeople = 1;

        for (int i = 1; i < people.size(); i++) {
            if (people.get(i - 1).compareTo(people.get(i)) == 0){
                numberOfEqualPeople++;
            }
        }

        if (numberOfEqualPeople == 1){
            System.out.println("No matches");
            return;
        }

        System.out.printf("%d %d %d", numberOfEqualPeople, people.size() - numberOfEqualPeople, people.size());
    }
}
