package Google;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Person> people = new ArrayList<>();

        String command = scanner.readLine();

        while (!command.equals("End")) {
            String[] commandSplit = command.split("\\s+");

            boolean containsPerson = false;

            Person currentPerson = new Person();
            for (Person person : people) {
                if (person.getName().equals(commandSplit[0])){
                    containsPerson = true;
                    currentPerson = person;
                    break;
                }
            }

            switch (commandSplit[1]){
                case "company":
                    Company company = new Company(commandSplit[2], commandSplit[3], Double.parseDouble(commandSplit[4]));
                    currentPerson.setCompany(company);
                    break;
                case "pokemon":
                    Pokemon pokemon = new Pokemon(commandSplit[2], commandSplit[3]);
                    currentPerson.addPokemon(pokemon);
                    break;
                case "parents":
                    Parent parent = new Parent(commandSplit[2], commandSplit[3]);
                    currentPerson.addParent(parent);
                    break;
                case "children":
                    Children children = new Children(commandSplit[2], commandSplit[3]);
                    currentPerson.addChildren(children);
                    break;
                case "car":
                    Car car = new Car(commandSplit[2], Integer.parseInt(commandSplit[3]));
                    currentPerson.setCar(car);
                    break;
            }

            if (!containsPerson){
                currentPerson.setName(commandSplit[0]);
                people.add(currentPerson);
            }

            command = scanner.readLine();
        }
        String personToSearch = scanner.readLine();

        people.stream().filter(x -> x.getName().equals(personToSearch))
                .limit(1)
                .forEach(p -> System.out.println(p));
    }
}
