package SortPeopleByNameAndAge;

/**
 * Created by 200sx on 2/26/2017.
 */
public class Person {
    private String FirstName;
    private String LastName;
    private int Age;

    public Person(String FirstName, String LastName, int Age){
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Age = Age;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public int getAge() {
        return Age;
    }

    @Override
    public String toString(){
        return this.getFirstName() + " " + this.getLastName() + " is a " + this.getAge() + " years old.";
    }
}
