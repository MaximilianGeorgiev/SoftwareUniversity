package ComparingObjects;


/**
 * Created by 200sx on 4/2/2017.
 */
public class Person implements Comparable<Person> {
    private String name;
    private int age;
    private String town;

    public Person(String name, int age, String town){
        this.setName(name);
        this.setAge(age);
        this.setTown(town);
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

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    @Override
    public int compareTo(Person personToCompare) {
        if (this.getName().compareTo(personToCompare.getName()) == 0){
            if (Integer.compare(this.getAge(), personToCompare.getAge()) == 0){
                return this.getTown().compareTo(personToCompare.getTown());
            }
            return Integer.compare(this.getAge(), personToCompare.getAge());
        }
        return this.getName().compareTo(personToCompare.getName());
    }
}
