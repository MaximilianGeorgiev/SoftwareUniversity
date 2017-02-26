package FirstAndReserveTeam;

/**
 * Created by 200sx on 2/26/2017.
 */
public class Person {
    private String FirstName;
    private String LastName;
    private int Age;
    private double salary;

    public Person(String firstName, String secondName, int age, double salary){
        this.FirstName = firstName;
        this.LastName = secondName;
        this.Age = age;
        this.salary = salary;
    }

    public double getSalary(){
        return this.salary;
    }
    public void setSalary(double salary){
        if (salary < 460){
                throw new IllegalArgumentException("Salary cannot be less than 460 leva");
        }
        this.salary = salary;
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

    public void setAge(int age) {
        if (age <= 0){
            throw new IllegalArgumentException("Age cannot be zero or negative integer");
        }
        this.Age = age;
    }

    public void setFirstName(String firstName){
        if (firstName.length() < 3){
            throw new IllegalArgumentException("First name cannot be less than 3 symbols");
        }
        this.FirstName = firstName;
    }

    public void setLastName(String lastName){
        if (lastName.length() < 3){
            throw new IllegalArgumentException("Last name cannot be less than 3 symbols");
        }
        this.LastName = lastName;
    }

    public void increaseSalary (int bonus){
        if (this.getAge() > 30){
            this.salary += this.salary * bonus / 100;
        } else {
            this.salary += this.salary * bonus / 200;
        }
    }

    @Override
    public String toString(){
        return this.getFirstName() + " " + this.getLastName() + " get " +  this.salary + " leva";
    }
}
