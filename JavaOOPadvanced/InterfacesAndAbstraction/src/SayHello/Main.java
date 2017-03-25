package SayHello;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 200sx on 3/18/2017.
 */
public class Main {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();


        persons.add(new Bulgarian("Pesho"));
        persons.add(new European("Pesho"));
        persons.add(new Chinese("Pesho"));

        for (Person person : persons) {
            print(person);
        }
    }

    private static void print(Person person) {
        person.sayHello();
    }

}
