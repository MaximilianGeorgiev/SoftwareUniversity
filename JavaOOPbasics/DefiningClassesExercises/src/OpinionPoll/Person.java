package OpinionPoll;

public class Person {
    public int age;
    public String name;

    public Person() {
        this.name = "No name";
        this.age = 1;
    }

    public Person(int age) {
        this.name = "No name";
        this.age = age;
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

}

