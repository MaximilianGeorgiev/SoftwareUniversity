package StrategyPattern;

import java.util.Comparator;

/**
 * Created by 200sx on 4/3/2017.
 */
public class PersonComparatorOne implements Comparator<Person> {

    @Override
    public int compare(Person person1, Person person2) {
        if (Integer.compare(person1.getName().length(), person2.getName().length()) == 0){
            return Character.compare(person1.getName().toLowerCase().charAt(0), person2.getName().toLowerCase().charAt(0));
        }
        return Integer.compare(person1.getName().length(), person2.getName().length());
    }
}
