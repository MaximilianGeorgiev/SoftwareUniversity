package SalaryIncrease;

/**
 * Created by 200sx on 2/26/2017.
 */
public class Person {
    private String FirstName;
    private String LastName;
    private int Age;
    private double salary;

    public Person(String FirstName, String LastName, int age, double salary){
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Age = age;
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
        Age = age;
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
