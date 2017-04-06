package StrategyPattern;

import java.util.Comparator;

/**
 * Created by 200sx on 4/2/2017.
 */
public class Person{
    private String name;
    private int age;

    public Person(String name, int age){
        this.setName(name);
        this.setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return this.getName() + " " + this.getAge();
    }

}
