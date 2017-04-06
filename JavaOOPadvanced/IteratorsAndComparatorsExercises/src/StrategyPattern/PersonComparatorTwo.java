package StrategyPattern;

import java.util.Comparator;

/**
 * Created by 200sx on 4/3/2017.
 */
public class PersonComparatorTwo implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
    }
}
