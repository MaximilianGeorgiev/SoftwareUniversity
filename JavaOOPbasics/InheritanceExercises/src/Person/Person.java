package Person;

/**
 * Created by 200sx on 3/4/2017.
 */
public class Person {
    protected String name;
    protected int age;

    public Person(){}

    public Person(String name, int age) {
        this.setName(name);
        this.setAge(age);
    }

    public String getName() {
        return name;
    }

    protected void setName(String name) {
        if (name.trim().length() < 3){
            throw new IllegalArgumentException("Name's length should not be less than 3 symbols!");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    protected void setAge(int age) {
        if (age < 1) {
            throw new IllegalArgumentException("Age must be positive!");
        }
        this.age = age;
    }
}
